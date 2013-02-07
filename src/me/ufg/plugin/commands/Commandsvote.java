package me.ufg.plugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commandsvote implements CommandExecutor{
	public boolean onCommand(CommandSender sender, Command cmd, String commandLable, String[] args){
	if(commandLable.equalsIgnoreCase("vote")){
		if (args.length == 0)  {
            sender.sendMessage(ChatColor.RED + "Usage: " + "/vote [message]");
            return false;
        }

        StringBuilder message = new StringBuilder();
        if (args.length > 0) {
            message.append(args[0]);
            for (int i = 1; i < args.length; i++) {
                message.append(" ");
                message.append(args[i]);
            }
        }

        if (sender instanceof Player) {
            Bukkit.getLogger().info("[" + sender.getName() + "] " + message);
        }

        Bukkit.getServer().broadcastMessage(ChatColor.LIGHT_PURPLE + "[Voted] " + message);

        return true;
        
    }
	return false; 
        
    }

}


