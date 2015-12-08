package xyz.tulipplugins.minigame.scoreboard;

import java.util.LinkedList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

public class MainScoreboard implements Listener {
	
	
	public void setupScoreboard(LinkedList<Player> bluePlayers, LinkedList<Player> redPlayers){
		
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		
		Scoreboard board = manager.getNewScoreboard();
		
		Team team = board.registerNewTeam("teamname");
		
		
	}

}
