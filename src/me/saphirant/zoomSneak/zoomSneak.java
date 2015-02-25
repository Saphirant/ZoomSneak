package me.saphirant.zoomSneak;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class zoomSneak extends JavaPlugin implements Listener{

	@Override
	public void onDisable() {
		
		
	}
	
	@Override
	public void onEnable() {
	
	PluginManager pm = getServer().getPluginManager();
	
	pm.registerEvents(this, this);
		
	}
	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerSneak(PlayerToggleSneakEvent e){
		Player p = e.getPlayer();
		p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 2, 10));
	}
}
