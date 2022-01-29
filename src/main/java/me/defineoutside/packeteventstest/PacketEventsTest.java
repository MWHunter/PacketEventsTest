package me.defineoutside.packeteventstest;

import com.github.retrooper.packetevents.PacketEvents;
import io.github.retrooper.packetevents.factory.spigot.SpigotPacketEventsBuilder;
import org.bukkit.plugin.java.JavaPlugin;

public final class PacketEventsTest extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        PacketEvents.setAPI(SpigotPacketEventsBuilder.build(this));
        PacketEvents.getAPI().getSettings().bStats(true).checkForUpdates(false).debug(true);
        PacketEvents.getAPI().load();

        PacketEvents.getAPI().getEventManager().registerListener(new PacketListener());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
