package xyz.tulipplugins.minigame.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import xyz.tulipplugins.minigame.teams.Teams;

public class ArenaCommands implements CommandExecutor {
	ArrayList<Double> blue = new ArrayList<Double>();
	ArrayList<Double> red = new ArrayList<Double>();
	
	

	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
		Player player = (Player) sender;
		if (command.getName().equalsIgnoreCase("setarenared")) {
			if (player.hasPermission("minigame.setarenared")) {
				

				double xcoord = player.getLocation().getX();
				double ycoord = player.getLocation().getY();
				double zcoord = player.getLocation().getZ();
				red.add(xcoord);
				red.add(zcoord);
				red.add(ycoord);
				player.sendMessage("Red team spawn set.");
				

			} else {
				player.sendMessage(ChatColor.RED + "You do not have permission to do that.");

			}

		}
		if (command.getName().equalsIgnoreCase("setarenablue")) {
			if (player.hasPermission("minigame.setarenablue")) {
				

				double xcoord = player.getLocation().getX();
				double ycoord = player.getLocation().getY();
				double zcoord = player.getLocation().getZ();

				blue.add(xcoord);
				blue.add(zcoord);
				blue.add(ycoord);
				player.sendMessage("Blue team spawn set.");
				

			} else {
				player.sendMessage(ChatColor.RED + "You do not have permission to do that.");

			}

		}
		if (command.getName().equalsIgnoreCase("join")) {
			
					if (blue.isEmpty() || red.isEmpty()) {
						player.sendMessage(ChatColor.DARK_PURPLE + "No arena is set.");

					} else {
						
						double bxcoord = blue.get(0);
						double bzcoord = blue.get(1);
						double bycoord = blue.get(2);
						Location bloc = new Location(player.getWorld(), bxcoord, bycoord, bzcoord);
						Teams TeamsObject = new Teams(); 
						TeamsObject.teamCount(player);
				
			}

		}
		return false;
	}
}