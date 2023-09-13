package net.unethicalite.api.movement;

import net.runelite.api.Client;
import net.unethicalite.api.input.naturalmouse.NaturalMouse;
import net.unethicalite.client.Static;

import javax.inject.Inject;

public class Antiban {
    @Inject
    private Client client;
    @Inject
    private static NaturalMouse naturalMouse;

    public static void randomMouseMove()
    {
        Static.getInteractionHandler().randomMouseMove();
    }

}
