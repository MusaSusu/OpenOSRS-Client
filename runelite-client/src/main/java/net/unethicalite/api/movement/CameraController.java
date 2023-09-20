package net.unethicalite.api.movement;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;

import java.awt.*;

@Slf4j
public class CameraController {

    public static void alignToTarget(double angle){
        try {
            Static.getInteractionHandler().moveCamera(deltaX(angle),0);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    public static void alignToNorth(double angle){
        int deltaX = deltaXToNorth(angle);
        if (Math.abs(deltaX) < 30)
        {
            return;
        }
        try {
            Static.getInteractionHandler().moveCamera(deltaXToNorth(angle),0);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    public static double angleFromLocal(LocalPoint A, LocalPoint B, LocalPoint player) {
        Vector3D vectorA = new Vector3D(A.getX(), A.getY(), 0);
        Vector3D vectorB = new Vector3D(B.getX(), B.getY(), 0);
        Vector3D vectorP = new Vector3D(player.getX(), player.getY(), 0);
        Vector3D PA = vectorA.subtract(vectorP);
        Vector3D PB = vectorB.subtract(vectorP);

        Vector3D cross = PA.crossProduct(PB);
        double signedAngle = cross.dotProduct(new Vector3D(0, 0, 1));
        double angle = Math.acos(PA.dotProduct(PB) / (PA.getNorm() * PB.getNorm()));
        if (signedAngle < 0) {

            return Math.toDegrees(-angle);
        }
        return Math.toDegrees(angle);
    }

    public static double angleFromLocal(LocalPoint target,LocalPoint from)
    {
        LocalPoint center = Players.getLocal().getLocalLocation();
        return angleFromLocal(target,from,center);
    }

    public static double angleFromLocal(LocalPoint from)
    {
        LocalPoint center = Players.getLocal().getLocalLocation();
        LocalPoint target = new LocalPoint(center.getX(),center.getY() + 256);
        return angleFromLocal(target,from,center);
    }




    public static double angleFromPerspective(Point target, Point from, Point center)
    {
        Vector3D vectorTarget = new Vector3D(target.getX(), target.getY(), 0);
        Vector3D vectorFrom = new Vector3D(from.getX(), from.getY(), 0);
        Vector3D vectorP = new Vector3D(center.getX(), center.getY(), 0);

        Vector3D PF = vectorFrom.subtract(vectorP);
        Vector3D PT = vectorTarget.subtract(vectorP);

        Vector3D cross = PF.crossProduct(PT);
        double signedAngle = cross.dotProduct(new Vector3D(0,0,1));
        double angle = Math.toDegrees(Math.acos(PF.dotProduct(PT)) / (PF.getNorm() * PT.getNorm()));

        if (signedAngle < 0) {
           return -angle;
        }
        return angle;
    }

    public static double angleFromPerspective(Point from){
        Point center = centerOfView();
        Point target = new Point(centerOfView().x,centerOfView().y + 100);
        return angleFromPerspective(target,from,center);
    }


    public int calcPitchRange(int x, int y, int z) {
        Client client = Static.getClient();
        if (x >= 128 && y >= 128 && x <= 13056 && y <= 13056) {

            x -= client.getCameraX();
            y -= client.getCameraY();
            z -= client.getCameraZ();

            final int cameraPitch = client.getCameraPitch();
            final int cameraYaw = client.getCameraYaw();

            final int pitchSin = Perspective.SINE[cameraPitch];
            final int pitchCos = Perspective.COSINE[cameraPitch];
            final int yawSin = Perspective.SINE[cameraYaw];
            final int yawCos = Perspective.COSINE[cameraYaw];

            final int
                    y1 = y * yawCos - x * yawSin >> 16,
                    y2 = z * pitchCos - y1 * pitchSin >> 16,
                    z1 = y1 * pitchCos + z * pitchSin >> 16;

            final int
                    y22 = z * pitchCos - y1 * pitchSin >> 16,
                    z11 = y1 * pitchCos + z * pitchSin >> 16;

            if (z1 >= 50) {
                final int scale = client.getScale();
                final int pointY = client.getViewportHeight() / 2 + y2 * scale / z1;
                return pointY + client.getViewportYOffset();
            }
        }
        return -1;
    }


    //Find x pixel mouse movement needed to align to north of view.
    public static int deltaXToNorth(double angle) {
        int deltaYaw = (int) -(2048 * (angle/360));
        //System.out.println("deltayaw" + deltaYaw);
        int targetYaw = Static.getClient().getCameraYaw() + deltaYaw;
        //System.out.println("current yaw:"+ Static.getClient().getCameraYaw());
        //System.out.println("prev yaw:" + targetYaw);
        if (targetYaw>=1024){
            targetYaw = -(2048 % (2048 - targetYaw));
        }
        else
        {
            targetYaw = targetYaw;
        }
        //System.out.println(targetYaw);
        return targetYaw / 2;
    }

    public static int deltaX(double angle) {
        int deltaYaw = (int) -(2048 * (angle/360));
        return deltaYaw/2 ;
    }

    public static Point centerOfView(){
        int x  = (Static.getClient().getViewportHeight()/2) + (Static.getClient().getViewportXOffset());
        int y = (Static.getClient().getViewportHeight()/2) + (Static.getClient().getViewportYOffset());
        return new Point(x,y);
    }

    private double jagextoDegrees(double x) {
        return (x / 2048) * 360;
    }
}
