package net.runelite.client.plugins.musaPanel;


import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("Musa Repo")
public interface MusaConfig extends Config {

    String CONFIG_GROUP = "Musa Repo";

    @ConfigItem(
            keyName = "Quest",
            name = "Quest Selection",
            description = "",
            position = 0
    )
    default QuestEnum questSelection(){ return QuestEnum.RomeoAndJuliet;}

    @ConfigItem(
            keyName = "Quest",
            name = "Quest Selection",
            description = "",
            position = 1
    )
    default boolean questRunning(){return false;}
}

