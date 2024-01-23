package net.unethicalite.api.movement;

import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.interaction.InteractionHandler;

import java.awt.*;

public class Antiban {

    public static void randomMouseMove()
    {
        Static.getInteractionHandler().randomMouseMove();
    }

    public static void checkStats()
    {
        if (Tabs.isOpen(Tab.SKILLS))
        {
            if (InteractionHandler.checkSkillCounter()){
                Widgets.get(Tab.INVENTORY.getWidgetInfo()).interact(0);
            }
            else{
                return;
            }
        }
        else
        {
            Widgets.get(Tab.SKILLS.getWidgetInfo()).interact(0);
        }
    }

    public static void moveCamera(){
        if (InteractionHandler.checkCameraCounter())
        {
            try {
                Static.getInteractionHandler().moveCamera(Rand.nextInt(-50,50),Rand.nextInt(-20,20));
            } catch (AWTException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
