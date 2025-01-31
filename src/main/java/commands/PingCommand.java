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

        if(sender instanceof Player && args.length <=1){
                switch (args.length){
                    case 0:
                        Player jugador = (Player) sender;
                        int ping;
                        ping = ((CraftPlayer) jugador).getHandle().ping;
                        jugador.sendMessage("El ping del jugador es: " + ping + "ms" );
                        return true;
                    case 1:
                        Player target = Bukkit.getPlayerExact(args[0]);
                        if(target== null){
                            sender.sendMessage("El jugador no esta online.");
                            return true;
                        }
                        String pingString =  String.valueOf(((CraftPlayer)target). getHandle().ping);
                        sender.sendMessage("El ping de " + target.getName()+ " es: " +
                                ChatColor.translateAlternateColorCodes('&', "&c"+ pingString) );
                        return true;
                }
        }
        sender.sendMessage("Error: La sintaxis del comando es /ping <player>");
        return true;
    }
}
