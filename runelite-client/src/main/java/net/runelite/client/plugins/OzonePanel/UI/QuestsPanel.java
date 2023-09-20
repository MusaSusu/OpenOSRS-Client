package net.runelite.client.plugins.OzonePanel.UI;

import net.miginfocom.swing.MigLayout;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.OzonePanel.MusaConfig;
import net.runelite.client.plugins.OzonePanel.QuestEnum;

import javax.swing.*;

public class QuestsPanel extends MusaPanelContainer {
    public QuestsPanel(MusaConfig config, ConfigManager configManager) {
        super("Quests",config, configManager);
    }

    @Override
    protected void rebuild()
    {
        removeAll();

        JPanel status = new JPanel(new MigLayout());
        status.add(add(createTextSection("Quest Running:")));
        JLabel currentQuest = new JLabel("None");
        status.add(currentQuest);
        add(status,"span");
        add(createComboBoxSection("Quest","Quest", QuestEnum.class),"span,grow");
        add(createStartButton(currentQuest));
        add(createStopButton(currentQuest));
    }
}
