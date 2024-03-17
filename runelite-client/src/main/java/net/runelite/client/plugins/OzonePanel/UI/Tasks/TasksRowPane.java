package net.runelite.client.plugins.OzonePanel.UI.Tasks;

import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.components.shadowlabel.JShadowedLabel;
import net.runelite.client.util.SwingUtil;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;


public class TasksRowPane extends JPanel
{

    private String task;

    protected JPanel createRow(String text, int duration)
    {
        JPanel container = new JPanel(new BorderLayout());
        container.setBorder(new EmptyBorder(7, 7, 6, 0));
        container.setBackground(ColorScheme.DARKER_GRAY_COLOR);

        JPanel textPane = new JPanel(new GridLayout(2, 1));
        textPane.setBorder(new EmptyBorder(0, 0, 0, 5));
        textPane.setBackground(ColorScheme.DARKER_GRAY_COLOR);

        JShadowedLabel title = new JShadowedLabel(text);
        title.setBorder(new EmptyBorder(0, 0, 5, 0));
        title.setFont(FontManager.getRunescapeFont());
        title.setForeground(Color.WHITE);

        JLabel time = new JLabel(duration + "mins");
        time.setFont(FontManager.getRunescapeSmallFont());
        time.setForeground(Color.GRAY);

        textPane.add(title);
        textPane.add(time);

        JButton button = new JButton("x");
        button.setPreferredSize(new Dimension(10, 10));
        button.setBorder(new EmptyBorder(0, 0, 0, 5));
        SwingUtil.removeButtonDecorations(button);

        container.add(textPane, BorderLayout.WEST);
        container.add(button, BorderLayout.EAST);

        return container;
    }
}
