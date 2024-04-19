package net.runelite.client.plugins.OzonePanel.UI;

import net.miginfocom.swing.MigLayout;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.OzonePanel.MusaConfig;
import net.runelite.client.plugins.OzonePanel.QuestEnum;
import net.runelite.client.plugins.PluginInstantiationException;
import net.runelite.client.util.Text;
import net.unethicalite.client.Static;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Singleton
public class QuestsPanel extends QuestsPanelContainer
{
    @Inject
    public QuestsPanel(MusaConfig config, ConfigManager configManager)
    {
        super("Quests", config, configManager);

        setLayout(new MigLayout());
        JPanel status = new JPanel(new MigLayout());
        status.add(add(createTextSection("Quest Running:")));
        JLabel currentQuest = new JLabel("None");
        status.add(currentQuest);
        add(status, "span");
        add(createComboBoxSection("Quest", "Quest", QuestEnum.class), "span,grow");
        add(createStartButton(currentQuest));
        add(createStopButton(currentQuest));
    }

    @Override
    protected void rebuild()
    {
    }

    protected JPanel createStartButton(JLabel label)
    {
        JPanel section = new JPanel(new GridLayout(1, 1));
        JButton button = new JButton("Start");
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // This code is executed when the button is clicked
                JOptionPane.showMessageDialog(section, "Starting Quest");
                Enum<?> selectedItem = Enum.valueOf(QuestEnum.class, configManager.getConfiguration(MusaConfig.CONFIG_GROUP, "Quest"));
                String newText = Text.titleCase(selectedItem);
                label.setText(newText);
                try
                {
                    configManager.setConfiguration("MusaQuests", "Quest", selectedItem);
                    Static.getInteractionHandler().startQuestPlugin();
                }
                catch (PluginInstantiationException ex)
                {
                    System.out.println("cant start");
                    throw new RuntimeException(ex);
                }
            }
        });
        section.add(button, "span,grow");
        return section;
    }

    protected JPanel createStopButton(JLabel label)
    {
        JPanel section = new JPanel(new GridLayout(1, 1));
        JButton button = new JButton("Stop");
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // This code is executed when the button is clicked
                JOptionPane.showMessageDialog(section, "Starting Quest");
                label.setText("None");
                try
                {
                    System.out.println("STOPPING PLUGIN TEST");
                    Static.getInteractionHandler().stopQuestPlugin();
                }
                catch (PluginInstantiationException ex)
                {
                    System.out.println("cant stop");
                    throw new RuntimeException(ex);
                }
            }
        });

        section.add(button, "span,grow");
        return section;
    }
}
