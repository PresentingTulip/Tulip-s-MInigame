package xyz.tulipplugins.minigame;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.permission.Permission;
import xyz.tulipplugins.minigame.scoreboard.MainScoreboard;
import xyz.tulipplugins.minigame.teams.Kits;


public class Minigame extends JavaPlugin implements Listener {
	LinkedList<Player> bluePlayers = new LinkedList<Player>();
	LinkedList<Player> redPlayers = new LinkedList<Player>();
	private boolean gameStarted;
	public static Minigame instance;
	public static Permission permission = null;
	public static Economy economy = null;
	public static Chat chat = null;

	private boolean setupPermissions() {
		RegisteredServiceProvider<Permission> permissionProvider = getServer().getServicesManager()
				.getRegistration(net.milkbowl.vault.permission.Permission.class);
		if (permissionProvider != null) {
			permission = permissionProvider.getProvider();
		}
		return (permission != null);
	}

	private boolean setupChat() {
		RegisteredServiceProvider<Chat> chatProvider = getServer().getServicesManager()
				.getRegistration(net.milkbowl.vault.chat.Chat.class);
		if (chatProvider != null) {
			chat = chatProvider.getProvider();
		}

		return (chat != null);
	}

	private boolean setupEconomy() {
		RegisteredServiceProvider<Economy> economyProvider = getServer().getServicesManager()
				.getRegistration(net.milkbowl.vault.economy.Economy.class);
		if (economyProvider != null) {
			economy = economyProvider.getProvider();
		}

		return (economy != null);
	}

	public void onEnable(){
		instance = this;
		
		
	}

	public void StartCountdown(Player player, List<Player> playerlist, Player name0, Player name1, Player name2, Player name3, Player name4, Player name5, Player name6, Player name7, Player name8, Player name9){
		
		int i = 10;
		BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
		scheduler.scheduleSyncRepeatingTask(this, new Runnable(){
			@Override
			public void run(){
				if (i > 0){
				player.sendMessage(ChatColor.GREEN + "Game is starting in + " + i + " seconds");
				}else{
					player.sendMessage(ChatColor.DARK_PURPLE + "Game is starting!");
					bluePlayers.add(name0);
					bluePlayers.add(name2);
					bluePlayers.add(name4);
					bluePlayers.add(name6);
					bluePlayers.add(name8);
					redPlayers.add(name1);
					redPlayers.add(name3);
					redPlayers.add(name5);
					redPlayers.add(name7);
					redPlayers.add(name9);
					Kits KitObject = new Kits();
					KitObject.startGame(name0, name1, name2, name3, name4, name5, name6, name7, name8, name9);
					MainScoreboard ScoreboardObject = new MainScoreboard();
					ScoreboardObject.setupScoreboard(bluePlayers, redPlayers);
					gameStarted = true;
					
				}
				
				}
				
			
			
			
		},0L, 20L);
		
		
	}
	@EventHandler
	public void onPlayerChat(PlayerChatEvent event){
		Player player = event.getPlayer();
		String message = event.getMessage();
		
		if (gameStarted == true){
			
			if (bluePlayers.contains(player)){
				
				for (Player p : bluePlayers){
					player.sendMessage(ChatColor.BLUE + "[Team] " + message);
					
					
				}
				
				
			}
				
				
				
				
			}
			
			
			
			
		}
	
		
	}

	
	
	
	


