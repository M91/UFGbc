package me.ufg.plugin;

import me.ufg.plugin.commands.Commandsshop;
import me.ufg.plugin.commands.Commandsvote;

import org.bukkit.plugin.java.JavaPlugin;

public class UFGbc extends JavaPlugin{



	public void onEnable(){
		getCommand("vote").setExecutor(new Commandsvote());
		getCommand("shop").setExecutor(new Commandsshop());
		
	}
}
