package us.ryanleonard.clearall;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class ClearAllInventories extends JavaPlugin
{
	@Override
	public void onEnable() {
		getLogger().info("Clear All Inventories enabled.");
	}
	@Override
	public void onDisable() {
		getLogger().info("Clear All Inventories disabled.");
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("clearAllInventories")) {
			return true;
		}
		return false;
	}
}
