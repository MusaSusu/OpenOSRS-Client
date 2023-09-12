package net.unethicalite.client.managers.interaction;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.events.MenuAutomated;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.input.naturalmouse.NaturalMouse;
import net.unethicalite.client.Static;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;

@Singleton
@Slf4j
public class InteractionHandler {

    @Inject
    private Client client;
    @Inject
    private NaturalMouse naturalMouse;


    void interact(int identifier, int opcode, int param0, int param1,
                          int clickX, int clickY)
    {
        interact(identifier, opcode, param0, param1, clickX, clickY, null);
    }

   void interact(int identifier, int opcode, int param0, int param1, int clickX, int clickY,
                          SceneEntity sceneEntity)
    {
        client.interact(
                MenuAutomated.builder()
                        .identifier(identifier)
                        .opcode(MenuAction.of(opcode))
                        .param0(param0)
                        .param1(param1)
                        .clickX(clickX)
                        .clickY(clickY)
                        .entity(sceneEntity)
                        .build()
        );
    }

    public void combineInteract(int identifier, int opcode, int param0, int param1, int clickX, int clickY, SceneEntity sceneEntity,
                         int hoverx1, int hovery1)
    {
        interact(identifier, opcode,param0,param1,clickX,clickY,sceneEntity);
        naturalMouse.moveTo(hoverx1, hovery1);
    }

    // Move of x by 1 changes camera yaw by 2
    // Might need to add MouseDragged event since using mouse to move camera does that but this works still.
    public void moveCamera(int x, int y) throws AWTException {
        naturalMouse.moveTo(200,200);
        long time = System.currentTimeMillis();
        Point current = Mouse.getPosition();
        Mouse.pressed(current.x,current.y,Static.getClient().getCanvas(),time,2);
        Time.sleep(2000);
        naturalMouse.moveTo(current.x + x ,current.y + y);
        time = System.currentTimeMillis();
        Mouse.released(Mouse.getPosition().x, Mouse.getPosition().y, Static.getClient().getCanvas(),time,2);
    }

    public void dragItem(){

    }
}
