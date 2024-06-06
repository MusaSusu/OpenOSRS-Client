package net.unethicalite.api.movement;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.coords.LocalPoint;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.input.naturalmouse.NaturalMouse;
import net.unethicalite.client.Static;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.AWTException;
import java.awt.Point;

@Slf4j
@Singleton
public class CameraController
{
    @Inject
    private Client client;

    @Inject
    private NaturalMouse naturalMouse;

    public void moveCamera(int x, int y) throws AWTException
    {
        Point current = Mouse.getPosition();
        if (clickOffScreen(current))
        {
            naturalMouse.moveTo(Rand.nextInt(150, 250), Rand.nextInt(150, 250));
            current = Mouse.getPosition();
        }
        long time = System.currentTimeMillis();
        Mouse.pressed(current.x, current.y, Static.getClient().getCanvas(), time, 2);
        Time.sleep(500, 1000);
        naturalMouse.moveTo(current.x + x , current.y + y);
        time = System.currentTimeMillis();
        Mouse.released(Mouse.getPosition().x, Mouse.getPosition().y, Static.getClient().getCanvas(), time, 2);
    }

    private boolean clickOffScreen(Point point)
    {
        return point.x < 0 || point.y < 0
                || point.x > client.getViewportWidth() || point.y > client.getViewportHeight();
    }

    public void alignToWest(LocalPoint from)
    {
        int delta = deltaX(angleFromLocalToWest(from));
        if (Math.abs(delta) < 20)
        {
            return;
        }
        try
        {
            moveCamera(delta, 0);
        }
        catch (AWTException e)
        {
            throw new RuntimeException(e);
        }
    }

    public void alignToNorth(LocalPoint from)
    {
        int delta = deltaX(angleFromLocalToNorth(from));
        if (Math.abs(delta) < 20)
        {
            return;
        }
        try
        {
            moveCamera(delta, 0);
        }
        catch (AWTException e)
        {
            throw new RuntimeException(e);
        }
    }

    private static double angleFromLocal(LocalPoint A, LocalPoint B, LocalPoint player)
    {
        Vector3D vectorA = new Vector3D(A.getX(), A.getY(), 0);
        Vector3D vectorB = new Vector3D(B.getX(), B.getY(), 0);
        Vector3D vectorP = new Vector3D(player.getX(), player.getY(), 0);

        Vector3D PA = vectorA.subtract(vectorP);
        Vector3D PB = vectorB.subtract(vectorP);
        Vector3D cross = PA.crossProduct(PB);
        double signedAngle = cross.dotProduct(new Vector3D(0, 0, 1)) / cross.getNorm();
        double angle = Math.acos(PA.dotProduct(PB) / (PA.getNorm() * PB.getNorm()));
        if (signedAngle < 0)
        {
            System.out.println(Math.toDegrees(-angle));
            return Math.toDegrees(-angle);
        }
        System.out.println(Math.toDegrees(angle));
        return Math.toDegrees(angle);
    }

    public static double angleFromLocal(LocalPoint target, LocalPoint from)
    {
        LocalPoint center = Players.getLocal().getLocalLocation();
        return angleFromLocal(target, from, center);
    }

    private static double angleFromLocalToWest(LocalPoint from)
    {
        LocalPoint center = Players.getLocal().getLocalLocation();
        LocalPoint target = new LocalPoint(center.getX() - 256, center.getY());
        return angleFromLocal(target, from, center);
    }

    private static double angleFromLocalToNorth(LocalPoint from)
    {
        LocalPoint center = Players.getLocal().getLocalLocation();
        LocalPoint target = new LocalPoint(center.getX(), center.getY() + 256);
        return angleFromLocal(target, from, center);
    }

    public double angleFromLocalToNorthAtTile(LocalPoint center, LocalPoint from)
    {
        LocalPoint target = new LocalPoint(center.getX(), center.getY() + 256);
        return angleFromLocal(target, from, center);
    }

    public int deltaFromLocalToNorthAtTile(LocalPoint center, LocalPoint from)
    {
        return deltaX(angleFromLocalToNorthAtTile(center, from));
    }

    private static double angleFromPerspective(Point target, Point from, Point center)
    {
        Vector3D vectorTarget = new Vector3D(target.getX(), target.getY(), 0);
        Vector3D vectorFrom = new Vector3D(from.getX(), from.getY(), 0);
        Vector3D vectorP = new Vector3D(center.getX(), center.getY(), 0);

        Vector3D PF = vectorFrom.subtract(vectorP);
        Vector3D PT = vectorTarget.subtract(vectorP);

        Vector3D cross = PF.crossProduct(PT);
        double signedAngle = cross.dotProduct(new Vector3D(0, 0, 1));
        double angle = Math.toDegrees(Math.acos(PF.dotProduct(PT)) / (PF.getNorm() * PT.getNorm()));

        if (signedAngle < 0)
        {
           return -angle;
        }
        return angle;
    }

    private static double angleFromPerspective(Point from)
    {
        Point center = centerOfView();
        Point target = new Point(centerOfView().x, centerOfView().y + 100);
        return angleFromPerspective(target, from, center);
    }

    //Find x pixel mouse movement needed to align to view.
    //If angle is positive, we rotate clockwise from yaw 0. As in north spins clockwise.
    public int deltaX(double angle)
    {
        int targetYaw;
        if (angle > 0)
        {
            targetYaw = (int) (2048 * (angle / 360));
        }
        else
        {
            targetYaw = (int) (2048 - ((2048 * (-angle / 360))));
        }
        System.out.println("targetYaw = " + targetYaw);
        System.out.println("currentYaw = " + Static.getClient().getCameraYaw());

        int deltaYaw;
        if ((targetYaw - Static.getClient().getCameraYaw() + 2048) % 2048 < 1024)
        {
            //move compass clockwise, which means move mouse to the left.
             deltaYaw = -Math.min(Math.abs(targetYaw - Static.getClient().getCameraYaw()), 2048 - Math.abs(targetYaw - Static.getClient().getCameraYaw()));
        }
        else
        {
            //move compass counter-clockwise, which means move mouse to the right.
            deltaYaw =  Math.min(Math.abs(targetYaw - Static.getClient().getCameraYaw()), 2048 - Math.abs(targetYaw - Static.getClient().getCameraYaw()));
        }

        System.out.println(deltaYaw);
        return deltaYaw / 2;
    }

    private static Point centerOfView()
    {
        int x  = (Static.getClient().getViewportHeight() / 2) + (Static.getClient().getViewportXOffset());
        int y = (Static.getClient().getViewportHeight() / 2) + (Static.getClient().getViewportYOffset());
        return new Point(x, y);
    }

    private double jagextoDegrees(double x)
    {
        return (x / 2048) * 360;
    }
}
