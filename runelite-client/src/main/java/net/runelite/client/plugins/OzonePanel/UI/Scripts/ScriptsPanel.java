package net.runelite.client.plugins.OzonePanel.UI.Scripts;


import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.OzonePanel.MusaConfig;
import net.runelite.client.ui.PluginPanel;
import net.unethicalite.client.managers.LoopedPluginManager;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;

@Singleton
public class ScriptsPanel extends PluginPanel
{
    private final ScriptsPluginsListPanel PluginList;
    private String script = new String("None");
    private JLabel currentScript;
    @Inject
    public ScriptsPanel(MusaConfig config,
                        ConfigManager configManager,
                        ScriptsPluginsListPanel PluginList,
                        Provider<ScriptsPluginsListPanel> PluginListProvider,
                        LoopedPluginManager loopedPluginManager
                        )
    {
        super(false);
        this.PluginList = PluginList;


        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(0, 0, 0, 0));
        JPanel status = new JPanel(new BorderLayout());
        status.add(new JLabel("Scripts Running:"), BorderLayout.WEST);
        this.currentScript = new JLabel(script);
        status.add(currentScript, BorderLayout.EAST);
        add(status, BorderLayout.NORTH);

        add(PluginList.getMuxer(), BorderLayout.CENTER);
    }

    public void updateScript(String newScript)
    {
        this.currentScript.setText(newScript);
    }
}
