package me.ufg.plugin.commands;

import me.ufg.plugin.UFGbc;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class shop implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLable, String[] args){
		if(commandLable.equalsIgnoreCase("shop")) {
			sender.sendMessage("Link to shop : " + UFGbc.getInstance().getConfig().getString("ShopLink"));
		    return true;
			} else { if (commandLable.equalsIgnoreCase("ufgreload")){
			UFGbc.getInstance().reloadConfig();
			sender.sendMessage("Config reloaded!");
		}
		
		}return false;
	}
}
