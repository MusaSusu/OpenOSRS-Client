package net.runelite.client.plugins.OzonePanel.UI;

import net.miginfocom.swing.MigLayout;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.OzonePanel.MusaConfig;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.ui.components.shadowlabel.JShadowedLabel;
import net.runelite.client.util.SwingUtil;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class TasksPanel extends QuestsPanelContainer{

    public TasksPanel(MusaConfig config, ConfigManager configManager) {
        super("Tasks",config, configManager);
    }

    @Override
    protected void rebuild()
    {
        removeAll();
            setLayout(new MigLayout("wrap 1"));
        JPanel row = createRow("fdsfdsfdsfsd",32);
        row.setPreferredSize(new Dimension(PluginPanel.PANEL_WIDTH,30));
        add(row);
        add(row);
        revalidate();
    }

    protected JPanel createRow(String text,int duration)
    {
        JPanel container = new JPanel(new BorderLayout());
        container.setBorder(new EmptyBorder(7, 7, 6, 0));
        container.setBackground(ColorScheme.DARKER_GRAY_COLOR);

        JPanel textPane = new JPanel(new GridLayout(2,1));
        textPane.setBorder(new EmptyBorder(0, 0, 0, 5));
        textPane.setBackground(ColorScheme.DARKER_GRAY_COLOR);

        JShadowedLabel title = new JShadowedLabel(text);
        title.setBorder(new EmptyBorder(0,0,5,0));
        title.setFont(FontManager.getRunescapeFont());
        title.setForeground(Color.WHITE);

        JLabel time = new JLabel(duration + "mins");
        time.setFont(FontManager.getRunescapeSmallFont());
        time.setForeground(Color.GRAY);

        textPane.add(title);
        textPane.add(time);

        JButton button = new JButton("x");
        button.setPreferredSize(new Dimension(10,10));
        button.setBorder(new EmptyBorder(0, 0, 0, 5));
        SwingUtil.removeButtonDecorations(button);

        container.add(textPane,BorderLayout.WEST);
        container.add(button,BorderLayout.EAST);

        return container;
    }

    protected JPanel deleteButton()
    {
        JPanel panel = new JPanel();
        JButton button = new JButton("X");
        button.setSize(20,20);
        panel.add(button);
        return panel;
    }

}
