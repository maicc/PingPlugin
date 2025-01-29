package org.maic;

import commands.PingCommand;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Ping extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',"&aPingPlugin se ha iniciado") );
        this.getCommand("plugin2").setExecutor(new PingCommand());
    }

    @Override
    public void onDisable() {

    }
}
