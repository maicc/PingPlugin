package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class PingCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if(sender instanceof Player){
            Player jugador = (Player)sender;

            int ping = ((CraftPlayer)jugador).getHandle().ping;
            jugador.sendMessage(ping + "ms");

            return true;
        }

        return false;
    }
}
