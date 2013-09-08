package me.crafter.mc.ding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class dinglistener implements Listener {
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event){
		List<Player> allplayers = new ArrayList<Player>();
		allplayers.addAll(Arrays.asList(Bukkit.getServer().getOnlinePlayers()));
		if (allplayers.isEmpty()) return;
		for (Player player:allplayers){
			player.getWorld().playSound(event.getPlayer().getLocation(), Sound.LEVEL_UP, 0.1F, 1);
		}
	}
	
	@EventHandler
	public void onPlayerLeave(PlayerQuitEvent event){
		List<Player> allplayers = new ArrayList<Player>();
		allplayers.addAll(Arrays.asList(Bukkit.getServer().getOnlinePlayers()));
		if (allplayers.isEmpty()) return;
		for (Player player:allplayers){
			player.getWorld().playSound(event.getPlayer().getLocation(), Sound.PORTAL, 0.1F, 1);
		}
	}
	
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent event){
		String msg = event.getMessage();
		if (msg == null || msg == "") return;
		List<Player> allplayers = new ArrayList<Player>();
		allplayers.addAll(Arrays.asList(Bukkit.getServer().getOnlinePlayers()));
		if (allplayers.isEmpty()) return;
		for (Player player:allplayers){
			player.getWorld().playSound(event.getPlayer().getLocation(), Sound.ORB_PICKUP, 0.2F, 1);
		}
		
	}

	
}
