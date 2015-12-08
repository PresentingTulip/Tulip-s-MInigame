package xyz.tulipplugins.minigame.teams;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Kits implements Listener {
	
	public void startGame(Player name0, Player name1, Player name2, Player name3, Player name4, Player name5, Player name6, Player name7, Player name8, Player name9){
		
		Inventory inv = name0.getInventory();
		Inventory inv1 = name1.getInventory();
		Inventory inv2 = name2.getInventory();
		Inventory inv3 = name3.getInventory();
		Inventory inv4 = name4.getInventory();
		Inventory inv5 = name5.getInventory();
		Inventory inv6 = name6.getInventory();
		Inventory inv7 = name7.getInventory();
		Inventory inv8 = name8.getInventory();
		Inventory inv9 = name9.getInventory();
		ItemStack teamRed = nameItem(Material.APPLE, ChatColor.RED + "You're on red team. Don't eat this :P");
		ItemStack teamBlue = nameItem(Material.LAPIS_ORE, ChatColor.RED + "You're on blue team. Don't eat this :P");
		ItemStack ironHelm = nameItem (Material.IRON_HELMET, "");
		ItemStack ironChest = nameItem (Material.IRON_CHESTPLATE, "");
		ItemStack ironLegs = nameItem (Material.IRON_LEGGINGS, "");
		ItemStack ironBoots = nameItem (Material.IRON_BOOTS, "");
		inv.addItem(teamRed, ironHelm, ironChest, ironLegs, ironBoots);
		inv2.addItem(teamRed, ironHelm, ironChest, ironLegs, ironBoots);
		inv4.addItem(teamRed, ironHelm, ironChest, ironLegs, ironBoots);
		inv6.addItem(teamRed, ironHelm, ironChest, ironLegs, ironBoots);
		inv8.addItem(teamRed, ironHelm, ironChest, ironLegs, ironBoots);
		inv1.addItem(teamBlue);
		inv3.addItem(teamBlue);
		inv5.addItem(teamBlue);
		inv7.addItem(teamBlue);
		inv9.addItem(teamBlue);
		
		
		
		
		
		
		
		
	}
	
	private ItemStack nameItem(ItemStack item, String name){
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(name);
		item.setItemMeta(meta);
		return item;
	}
		private ItemStack nameItem(Material item, String name){
			return nameItem(new ItemStack(item), name);
			
			
		}
		

}
