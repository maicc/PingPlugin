package org.maic;

import commands.PingCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Ping extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"&bPingPlugin activado!"));
        this.getCommand("ping2").setExecutor(new PingCommand());
    }

    @Override
    public void onDisable() {

    }
}
