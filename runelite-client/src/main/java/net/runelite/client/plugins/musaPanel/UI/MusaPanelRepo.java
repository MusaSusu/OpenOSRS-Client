package net.runelite.client.plugins.musaPanel.UI;


import lombok.extern.slf4j.Slf4j;
import net.miginfocom.swing.MigLayout;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.musaPanel.MusaConfig;
import net.runelite.client.ui.PluginPanel;
import net.unethicalite.client.config.UnethicaliteConfig;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class MusaPanelRepo extends PluginPanel
{
    private final List<QuestsPanelContainer> containers = new ArrayList<>();
    private final JTabbedPane tabbedPane = new JTabbedPane();

    public MusaPanelRepo(Client client, MusaConfig config, ConfigManager configManager)
    {
        setLayout(new MigLayout());

        ScriptsPanel musaPanel = new ScriptsPanel(config,configManager);
        QuestsPanel questsPanel = new QuestsPanel(config,configManager);

        containers.add(musaPanel);
        containers.add(questsPanel);

        add(tabbedPane);

        tabbedPane.addTab(musaPanel.getTitle(), musaPanel);
        tabbedPane.addTab(questsPanel.getTitle(),questsPanel);
    }

    @Subscribe
    private void onConfigChanged(ConfigChanged e)
    {
        if (!e.getGroup().equals(UnethicaliteConfig.CONFIG_GROUP))
        {
            return;
        }
        SwingUtilities.invokeLater(() -> containers.forEach(QuestsPanelContainer::rebuild));
    }
}
