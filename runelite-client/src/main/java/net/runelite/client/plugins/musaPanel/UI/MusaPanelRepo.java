package net.runelite.client.plugins.musaPanel.UI;


import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.musaPanel.MusaConfig;
import net.runelite.client.ui.PluginPanel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class MusaPanelRepo extends PluginPanel
{
    private final List<QuestsPanelContainer> containers = new ArrayList<>();
    private final JTabbedPane tabbedPane = new JTabbedPane();

    /*
    public MusaPanelRepo(Client client, MusaConfig config, ConfigManager configManager)
    {
        setLayout(new MigLayout());

        ScriptsPanel scriptsPanel = new ScriptsPanel(config,configManager);
        QuestsPanel questsPanel = new QuestsPanel(config,configManager);
        TasksPanel tasksPanel = new TasksPanel(config,configManager);

        containers.add(scriptsPanel);
        containers.add(tasksPanel);
        containers.add(questsPanel);

        tabbedPane.addTab(scriptsPanel.getTitle(),scriptsPanel);
        tabbedPane.addTab(tasksPanel.getTitle(),tasksPanel);
        tabbedPane.addTab(questsPanel.getTitle(),questsPanel);

        add(tabbedPane);
    }
     */

    public MusaPanelRepo(Client client, MusaConfig config, ConfigManager configManager)
    {

        ScriptsPanel scriptsPanel = new ScriptsPanel(config,configManager);
        QuestsPanel questsPanel = new QuestsPanel(config,configManager);
        TasksPanel tasksPanel = new TasksPanel(config,configManager);

        containers.add(scriptsPanel);
        containers.add(tasksPanel);
        containers.add(questsPanel);

        tabbedPane.addTab(scriptsPanel.getTitle(),scriptsPanel);
        tabbedPane.addTab(tasksPanel.getTitle(),tasksPanel);
        tabbedPane.addTab(questsPanel.getTitle(),questsPanel);
        add(tabbedPane);
    }

    @Subscribe
    private void onConfigChanged(ConfigChanged e)
    {
        if (!e.getGroup().equals(MusaConfig.CONFIG_GROUP))
        {
            return;
        }
        SwingUtilities.invokeLater(() -> containers.forEach(QuestsPanelContainer::rebuild));

    }
}
