package net.runelite.client.plugins.OzonePanel;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.OzonePanel.UI.MusaPanelRepo;
import net.runelite.client.plugins.OzonePanel.UI.Scripts.ScriptsConfigPanel;
import net.runelite.client.plugins.OzonePanel.UI.Scripts.ScriptsPluginsListPanel;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.ImageUtil;
import net.unethicalite.api.plugins.SettingsPlugin;

import javax.inject.Inject;
import javax.inject.Provider;
import java.awt.image.BufferedImage;
import java.util.concurrent.ExecutorService;

@PluginDescriptor(
        name = "Musa Repo",
        hidden = true
)
@Slf4j
public class MusaPlugin extends SettingsPlugin
{

    @Inject
    private MusaConfig config;

    @Inject
    private EventBus eventBus;

    @Inject
    private ExecutorService executorService;

    @Inject
    private ClientToolbar clientToolbar;

    @Inject
    private ConfigManager configManager;

    @Inject
    private Client client;

    @Inject
    private Provider<MusaPanelRepo> MusaProvider;

    private MusaPanelRepo MusaPanel;
    private NavigationButton navButton;

    @Override
    protected void startUp() throws Exception
    {

        MusaPanel = MusaProvider.get();

        eventBus.register(MusaPanel);

        final BufferedImage icon = ImageUtil.loadImageResource(getClass(), "yinyang.png");

        navButton = NavigationButton.builder()
                .tooltip("MusaPanel")
                .icon(icon)
                .priority(-2)
                .panel(MusaPanel)
                .build();
        clientToolbar.addNavigation(navButton);
    }

    @Override
    protected void shutDown() throws Exception
    {
        clientToolbar.removeNavigation(navButton);
        eventBus.unregister(MusaPanel);
    }

    @Override
    public Config getConfig()
    {
        return config;
    }

    @Override
    public String getPluginName()
    {
        return "Musa Repo";
    }

    @Override
    public String getPluginDescription()
    {
        return "Musa Repo";
    }

    @Override
    public String[] getPluginTags()
    {
        return new String[]{"Musa Repo"};
    }
}
