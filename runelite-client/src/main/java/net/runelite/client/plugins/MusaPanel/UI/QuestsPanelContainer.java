package net.runelite.client.plugins.musaPanel.UI;

import lombok.Getter;
import net.miginfocom.swing.MigLayout;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginInstantiationException;
import net.runelite.client.plugins.musaPanel.MusaConfig;
import net.runelite.client.plugins.musaPanel.QuestEnum;
import net.runelite.client.ui.components.ComboBoxListRenderer;
import net.runelite.client.util.Text;
import net.unethicalite.client.Static;
import net.unethicalite.client.config.UnethicaliteConfig;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;


public abstract class QuestsPanelContainer extends JPanel
{
    @Getter
    private final String title;
    protected final MusaConfig config;
    protected final ConfigManager configManager;

    public QuestsPanelContainer(String title, MusaConfig config, ConfigManager configManager)
    {
        this.title = title;
        this.config = config;
        this.configManager = configManager;

        setLayout(new MigLayout("insets 5 0 0 -10"));

        rebuild();
    }

    protected JCheckBox createCheckBox(String text, String configKey)
    {
        JCheckBox checkBox = new JCheckBox(text);
        checkBox.setSelected(configManager.getConfiguration(UnethicaliteConfig.CONFIG_GROUP, configKey, Boolean.class));
        checkBox.addChangeListener(l -> configManager.setConfiguration(UnethicaliteConfig.CONFIG_GROUP, configKey,
                ((JCheckBox) l.getSource()).isSelected()));
        return checkBox;
    }

    protected JPanel createComboBoxSection(String text, String key, Class<? extends Enum> type)
    {
        JPanel section = new JPanel();
        section.add(new JLabel(text));
        JComboBox<Enum<?>> box = new JComboBox<>(type.getEnumConstants());
        box.setRenderer(new ComboBoxListRenderer<>());
        box.setForeground(Color.WHITE);
        box.setFocusable(false);

        try
        {
            Enum<?> selectedItem = Enum.valueOf(type, configManager.getConfiguration(MusaConfig.CONFIG_GROUP,"Quest"));
            box.setSelectedItem(selectedItem);
            box.setToolTipText(Text.titleCase(selectedItem));
        }
        catch (IllegalArgumentException ignored)
        {
        }

        box.addItemListener(e ->
        {
            if (e.getStateChange() == ItemEvent.SELECTED)
            {
                configManager.setConfiguration(MusaConfig.CONFIG_GROUP, key, e.getItem());
                box.setToolTipText(Text.titleCase((Enum<?>) box.getSelectedItem()));
            }
        });

        section.add(box);

        return section;
    }

    protected JPanel createTextSection(String text)
    {
        JPanel section = new JPanel();
        section.add(new JLabel(text));
        return section;
    }

    protected JPanel createStartButton(JLabel label)
    {
        JPanel section = new JPanel(new GridLayout(1,1));
        JButton button = new JButton("Start");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This code is executed when the button is clicked
                JOptionPane.showMessageDialog(section, "Starting Quest");
                Enum<?> selectedItem = Enum.valueOf(QuestEnum.class, configManager.getConfiguration(MusaConfig.CONFIG_GROUP,"Quest"));
                String newText = Text.titleCase(selectedItem);
                label.setText(newText);
                try {
                    configManager.setConfiguration("MusaQuests","Quest",selectedItem);
                    Static.getInteractionHandler().startQuestPlugin();
                } catch (PluginInstantiationException ex) {
                    System.out.println("cant start");
                    throw new RuntimeException(ex);
                }
            }
        });

        section.add(button,"span,grow");
        return section;
    }

    protected JPanel createStopButton(JLabel label)
    {
        JPanel section = new JPanel(new GridLayout(1,1));
        JButton button = new JButton("Stop");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This code is executed when the button is clicked
                JOptionPane.showMessageDialog(section, "Starting Quest");
                label.setText("None");
                try {
                    System.out.println("STOPPING PLUGIN TEST");
                    Static.getInteractionHandler().stopQuestPlugin();
                } catch (PluginInstantiationException ex) {
                    System.out.println("cant stop");
                    throw new RuntimeException(ex);
                }
            }
        });

        section.add(button,"span,grow");
        return section;
    }

    protected abstract void rebuild();
}
