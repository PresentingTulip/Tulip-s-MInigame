package xyz.tulipplugins.minigame.teams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.bukkit.entity.Player;

import xyz.tulipplugins.minigame.Minigame;

public class Teams {
	public ArrayList<Integer> bluePlayers = new ArrayList<Integer>();
	public ArrayList<Integer> redPlayers = new ArrayList<Integer>();  
	public LinkedList<Player> playerlist = new LinkedList<Player>();
	public void teamCount(Player player){
	
		
		if (playerlist.size() < 10){
			playerlist.add(player);
			
			
		}
		else if (playerlist.size() == 10){
			
			Player name0 = playerlist.get(0);
			Player name1 = playerlist.get(1);
			Player name2 = playerlist.get(2);
			Player name3 = playerlist.get(3);
			Player name4 = playerlist.get(4);
			Player name5 = playerlist.get(5);
			Player name6 = playerlist.get(6);
			Player name7 = playerlist.get(7);
			Player name8 = playerlist.get(8);
			Player name9 = playerlist.get(9);
			Minigame mainObject = new Minigame();
			mainObject.StartCountdown(player, playerlist, name0, name1, name2, name3, name4, name5, name6, name7, name8, name9);
			
			
		}
		
		
		
		
	}

}
