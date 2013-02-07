package me.ufg.plugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commandsshop implements CommandExecutor{
	public boolean onCommand(CommandSender sender, Command cmd, String commandLable, String[] args){
	if(commandLable.equalsIgnoreCase("shop")) {
	    Player player = (Player)sender;
	    player.sendMessage("https://unforgivengaming.com/shop.html");
	    return true;
	}
	return false;
}
}