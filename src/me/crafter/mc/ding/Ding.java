package me.crafter.mc.ding;

import java.util.logging.Logger;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Ding extends JavaPlugin {

	public final Logger logger = Logger.getLogger("Mincraft");
	public final dinglistener dl = new dinglistener();
	

    public void onEnable(){
    	PluginDescriptionFile pdfFile = getDescription();
        this.logger.info("DeathNotice " + pdfFile.getVersion() + " has been ENABLED!");
        this.logger.info("DeathNotice is a Rev-Craft custom plugin.");
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(this.dl, this);
        }
 

    public void onDisable() {
    	PluginDescriptionFile pdfFile = getDescription();
        this.logger.info("DeathNotice " + pdfFile.getVersion() + " has been DISABLED!");
    }

	
}
