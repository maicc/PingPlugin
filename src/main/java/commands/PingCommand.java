package commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class PingCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {

        if(sender instanceof Player){
            if(alias.equalsIgnoreCase("ping2")) {
                if(args.length == 0) {
                    Player jugador = (Player) sender;
                    int ping;
                    ping = ((CraftPlayer) jugador).getHandle().ping;
                    jugador.sendMessage("El ping del jugador es: " + ping + "ms");
                    return true;
                } else{
                    Player target = Bukkit.getPlayerExact(args[0]);

                    if(target== null){
                        sender.sendMessage("El jugador no esta online.");
                        return true;
                    }
                    String ping =  String.valueOf(((CraftPlayer)target).getHandle().ping);
                    sender.sendMessage("El ping de: " + target.getName()+ " es: " +
                            ChatColor.translateAlternateColorCodes('&', "&c"+ ping) );

                    return true;
                }
            }
        }
        return false;
    }
}
