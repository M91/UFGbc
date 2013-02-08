package me.ufg.plugin;

import java.io.File;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;


public class UFGbc extends JavaPlugin{
	@Override
	public void onEnable(){
		File file = new File(getDataFolder() + File.separator + "config.yml");
		
		if (!file.exists()) {
			this.getLogger().info("Generating config.yml....");
			
			this.getConfig().addDefault("ShopLink", "https://unforgivengaming.com/shop.html");
			this.getConfig().options().copyDefaults(true);
			this.saveConfig();
			
		}
		getCommand("vote").setExecutor(new vote());
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLable, String[] args){
		if(commandLable.equalsIgnoreCase("shop")) {
			sender.sendMessage("ShopLink " +this.getConfig().getString("ShopLink"));
		    return true;
			} else { if (commandLable.equalsIgnoreCase("ufgreload")){
			this.reloadConfig();
			sender.sendMessage("Config reloaded!");
		}
		
		}return false;
	}
}

