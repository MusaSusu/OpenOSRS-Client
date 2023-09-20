package net.runelite.client.plugins.musaPanel.UI;

import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.musaPanel.MusaConfig;

public class ScriptsPanel extends QuestsPanelContainer
{
    public ScriptsPanel(MusaConfig config, ConfigManager configManager) {
        super("Scripts",config, configManager);
    }

    @Override
    protected void rebuild()
    {
        removeAll();
        revalidate();
    }
}
