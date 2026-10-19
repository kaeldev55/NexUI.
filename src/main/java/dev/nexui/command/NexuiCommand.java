package dev.nexui.command;

import dev.nexui.NexuiPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class NexuiCommand implements CommandExecutor {

    private final NexuiPlugin plugin;

    public NexuiCommand(NexuiPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (args.length == 0) {
            sender.sendMessage("§b[NEXUI] §fGunakan: /nexui <load|reload|unload>");
            return true;
        }

        if (args[0].equalsIgnoreCase("reload")) {
            sender.sendMessage("§a[NEXUI] §fConfig dan Project berhasil di-reload!");
            // Nanti kita tambahkan logika reload di sini
            return true;
        }

        sender.sendMessage("§c[NEXUI] §fSub-command tidak dikenal.");
        return true;
    }
}
