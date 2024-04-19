package net.runelite.client.plugins.OzonePanel.UI.Scripts;

import lombok.Getter;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigDescriptor;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginManager;
import net.runelite.client.plugins.PluginInstantiationException;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.config.PluginConfigurationDescriptor;
import net.runelite.client.ui.DynamicGridLayout;
import net.runelite.client.ui.MultiplexingPluginPanel;
import net.runelite.client.ui.PluginPanel;
import net.unethicalite.api.plugins.LoopedPlugin;
import net.unethicalite.client.Static;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.util.List;
import java.util.stream.Collectors;

@Singleton
public class ScriptsPluginsListPanel extends PluginPanel
{

    private final ConfigManager configManager;
    private final PluginManager pluginManager;
    private final List<Plugin> pluginList;
    private final EventBus eventBus;
    private final Provider<ScriptsConfigPanel> configPanelProvider;

    @Getter
    private final MultiplexingPluginPanel muxer;
    private PluginPanel mainPanel;

    @Inject
    public ScriptsPluginsListPanel(ConfigManager configManager,
                            PluginManager pluginManager,
                            Provider<ScriptsConfigPanel> configPanelProvider,
                            //Provider<ScriptsPanel> scriptsPanel,
                            EventBus eventBus
    )
    {
        super(false);

        this.configManager = configManager;
        this.pluginManager = pluginManager;
        this.configPanelProvider = configPanelProvider;
        this.eventBus = eventBus;
        this.pluginList = pluginManager.getPlugins().stream().filter(x -> x instanceof LoopedPlugin).collect(Collectors.toList());

        muxer = new MultiplexingPluginPanel(this)
        {
            @Override
            protected void onAdd(PluginPanel p)
            {
                eventBus.register(p);
            }

            @Override
            protected void onRemove(PluginPanel p)
            {
                eventBus.unregister(p);
            }
        };

        mainPanel = new PluginPanel() {};
        mainPanel.setBorder(new EmptyBorder(8, 10, 10, 10));
        mainPanel.setLayout(new DynamicGridLayout(0, 1, 0, 5));
        mainPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        for (Plugin plugin : pluginList)
        {
            JButton button = new JButton(plugin.getName());
            button.addActionListener(e -> openConfigurationPanel(makeDesc(plugin)));
            mainPanel.add(button);
        }

        add(mainPanel, BorderLayout.CENTER);

    }
    void openConfigurationPanel(PluginConfigurationDescriptor plugin)
    {
        ScriptsConfigPanel panel = configPanelProvider.get();
        panel.init(plugin);
        muxer.pushState(panel);
    }

    void startPlugin(PluginConfigurationDescriptor cd) throws PluginInstantiationException
    {
        configManager.syncProperties(cd.getConfigDescriptor().getGroup().value());
        pluginManager.setPluginEnabled(cd.getPlugin(), true);
        pluginManager.startPlugin(cd.getPlugin());
    }

    void stopPlugin(PluginConfigurationDescriptor cd) throws PluginInstantiationException
    {
        configManager.syncProperties(cd.getConfigDescriptor().getGroup().value());
        pluginManager.setPluginEnabled(cd.getPlugin(), false);
        pluginManager.startPlugin(cd.getPlugin());
    }

    PluginConfigurationDescriptor getDesc()
    {
        Plugin plugin = Static.getPluginManager().getPlugins().stream().filter(x -> x.getName().matches("Unethical Fighter")).findFirst().orElse(null);
        assert plugin != null;
        PluginConfigurationDescriptor desc = makeDesc(plugin);
        return desc;
    }

    private PluginConfigurationDescriptor makeDesc(Plugin plugin)
    {
        PluginDescriptor descriptor = plugin.getClass().getAnnotation(PluginDescriptor.class);
        Config config = Static.getPluginManager().getPluginConfigProxy(plugin);
        ConfigDescriptor configDescriptor = config == null ? null : Static.getConfigManager().getConfigDescriptor(config);
        List<String> conflicts = Static.getPluginManager().conflictsForPlugin(plugin).stream()
                .map(Plugin::getName)
                .collect(Collectors.toList());

        return new PluginConfigurationDescriptor(
                descriptor.name(),
                descriptor.description(),
                descriptor.tags(),
                plugin,
                config,
                configDescriptor,
                conflicts);
    }

    @Override
    public Dimension getPreferredSize()
    {
        return new Dimension(PANEL_WIDTH + SCROLLBAR_WIDTH, super.getPreferredSize().height);
    }
}
