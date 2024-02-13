package net.runelite.client.plugins.OzonePanel.UI.Tasks;

import lombok.Getter;
import net.miginfocom.swing.MigLayout;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.OzonePanel.MusaConfig;
import net.runelite.client.plugins.OzonePanel.UI.MusaPanelRepo;
import net.runelite.client.plugins.OzonePanel.UI.QuestsPanelContainer;
import net.runelite.client.plugins.config.FixedWidthPanel;
import net.runelite.client.ui.*;
import net.runelite.client.ui.components.shadowlabel.JShadowedLabel;
import net.runelite.client.util.SwingUtil;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;


@Singleton
public class TasksPanel extends JPanel {

    private final FixedWidthPanel mainPanel = new FixedWidthPanel();
    @Inject
    private TasksPanel(MusaConfig config,
                      ConfigManager configManager
    )
    {

        setLayout(new BorderLayout());

        JPanel row = createRow("fdsfdsfdsfsd",32);
        row.setPreferredSize(new Dimension(PluginPanel.PANEL_WIDTH,40));
        JPanel row1 = createRow("fdsfdsfdsfsd",32);
        row1.setPreferredSize(new Dimension(PluginPanel.PANEL_WIDTH,40));
        mainPanel.add(row);
        mainPanel.add(row1);

        add(mainPanel,BorderLayout.CENTER);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(e ->
                {
                }
                );

        add(addButton,BorderLayout.SOUTH);
    }

    protected void rebuild()
    {
    }

    private void addRow()
    {

    }

    protected JPanel createRow(String text,int duration)
    {
        JPanel container = new JPanel(new BorderLayout());
        container.setBorder(new EmptyBorder(5, 7, 0, 0));
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
        button.setPreferredSize(new Dimension(20,20));
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
