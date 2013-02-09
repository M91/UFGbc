package me.ufg.plugin;

import java.io.File;

import me.ufg.plugin.commands.shop;
import me.ufg.plugin.commands.vote;

import org.bukkit.plugin.java.JavaPlugin;



public class UFGbc extends JavaPlugin{
	private static UFGbc instance = new UFGbc();

	public static UFGbc getInstance() {
		return instance;
	}
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
		getCommand("shop").setExecutor(new shop());
		getCommand("ufgreload").setExecutor(new shop());
	}
	

}
