package net.runelite.client.plugins.OzonePanel.UI;

import net.miginfocom.swing.MigLayout;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.OzonePanel.MusaConfig;

import javax.swing.*;

public class TasksPanel extends QuestsPanelContainer{

    public TasksPanel(MusaConfig config, ConfigManager configManager) {
        super("Tasks",config, configManager);
    }

    @Override
    protected void rebuild()
    {
        removeAll();
        setLayout(new MigLayout("insets 5 0 0 -10"));
        createRow("fdsfdsfdsfsd",32,deleteButton());
        createRow("fdsfdsfdsfsd",42,deleteButton());
        revalidate();
    }

    protected void createRow(String text,int duration,JPanel button)
    {

        this.add( new JLabel(text),"align left");

        this.add(new JLabel(String.valueOf(duration)),"align right");

        this.add(button,"align left");

    }

    protected JPanel deleteButton()
    {
        JPanel panel = new JPanel();
        JButton button = new JButton("X");
        panel.add(button);
        return panel;
    }

}
