package dev.nexui;

import dev.nexui.command.NexuiCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class NexuiPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("=================================");
        getLogger().info(" NEXUI Framework is starting...");
        getLogger().info("=================================");

        // Daftarkan command
        this.getCommand("nexui").setExecutor(new NexuiCommand(this));

        // Cek PlaceholderAPI (Opsional)
        if (getServer().getPluginManager().getPlugin("PlaceholderAPI") != null) {
            getLogger().info("PlaceholderAPI terdeteksi! Fitur dinamis aktif.");
        } else {
            getLogger().warning("PlaceholderAPI tidak ditemukan. Placeholder tidak akan berfungsi.");
        }
    }

    @Override
    public void onDisable() {
        getLogger().info("NEXUI Framework dimatikan.");
    }
}
