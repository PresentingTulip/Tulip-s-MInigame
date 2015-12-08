package xyz.tulipplugins.minigame.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import xyz.tulipplugins.minigame.Minigame;
import xyz.tulipplugins.minigame.teams.Teams;

public class GameCommands implements CommandExecutor {
	Minigame m = new Minigame();
	Teams t = new Teams();
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args){
		
		Player player = (Player) sender;
		String message = "";
		if (command.getName().equalsIgnoreCase("shout")){
			for(int i = 0; i < args.length; i++){
			    String arg = args[i] + " ";
			    message = message + arg; 
			}
	
			if (m.bluePlayers.contains(player) || m.redPlayers.contains(player)){
				
				for (Player p : m.bluePlayers){
					p.sendMessage(message);
					
				}
				for (Player p2 : m.redPlayers){
					p2.sendMessage(message);
					
				}
				
				
			}else{
				player.sendMessage(ChatColor.RED + "You are not currently in a game.");
			}
			
			
		
		}
		
		
		
		
		return false;
	}
	
	

}
