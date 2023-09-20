package net.runelite.client.plugins.musaPanel.UI;

import lombok.Getter;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.musaPanel.MusaConfig;
import net.runelite.client.ui.components.ComboBoxListRenderer;
import net.runelite.client.util.Text;
import net.unethicalite.client.config.UnethicaliteConfig;

import javax.swing.*;
import java.awt.*;
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


    protected abstract void rebuild();
}
