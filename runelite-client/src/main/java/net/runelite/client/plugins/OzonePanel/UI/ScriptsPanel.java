package net.runelite.client.plugins.OzonePanel.UI;

import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.OzonePanel.MusaConfig;
import net.unethicalite.client.managers.interaction.InteractMethod;

public class ScriptsPanel extends MusaPanelContainer
{
    public ScriptsPanel(MusaConfig config, ConfigManager configManager) {
        super("Scripts",config, configManager);
    }

    @Override
    protected void rebuild()
    {
        removeAll();
        add(createComboBoxSection("Interact type", "interactMethod", InteractMethod.class), "wrap");
        revalidate();
    }
}
