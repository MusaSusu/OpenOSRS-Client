package net.runelite.client.plugins.musaPanel;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.musaPanel.UI.MusaPanelRepo;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.ImageUtil;
import net.unethicalite.api.plugins.SettingsPlugin;

import javax.inject.Inject;
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

    private MusaPanelRepo MusaPanel;
    private NavigationButton navButton;

    @Override
    protected void startUp() throws Exception
    {

        MusaPanel = new MusaPanelRepo(client,config,configManager);

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
