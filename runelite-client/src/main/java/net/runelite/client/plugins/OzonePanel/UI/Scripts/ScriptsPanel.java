package net.runelite.client.plugins.OzonePanel.UI.Scripts;

import lombok.Getter;
import net.miginfocom.swing.MigLayout;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.OzonePanel.MusaConfig;
import net.runelite.client.plugins.OzonePanel.UI.QuestsPanelContainer;
import net.runelite.client.plugins.config.PluginConfigurationDescriptor;
import net.runelite.client.ui.DynamicGridLayout;
import net.runelite.client.ui.MultiplexingPluginPanel;
import net.runelite.client.ui.PluginPanel;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Singleton
public class ScriptsPanel extends PluginPanel
{
    private final ScriptsPluginsListPanel PluginList;
    private JPanel CenterView;
    @Inject
    public ScriptsPanel(MusaConfig config,
                        ConfigManager configManager,
                        ScriptsPluginsListPanel PluginList,
                        Provider<ScriptsPluginsListPanel> PluginListProvider
                        )
    {
        super(false);
        this.PluginList = PluginList;

        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(0, 0, 0, 0));
        JPanel status = new JPanel(new BorderLayout());
        status.add(new JLabel("Scripts Running:"),BorderLayout.WEST);
        JLabel currentScript = new JLabel("None");
        status.add(currentScript,BorderLayout.EAST);
        add(status,BorderLayout.NORTH);

        add(PluginList.getMuxer(),BorderLayout.CENTER);
    }

    void updateCenterView()
    {
        PluginList.revalidate();
    }
}
