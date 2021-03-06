package tk.roccodev.jaatp.config;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;

public class MessageConfig {
	
	public static FileConfiguration config;
	
	public static String PERMISSION_DENIED;
	public static String ERROR_PLAYER_NOT_FOUND;
	public static String ERROR_PLAYER_MENTION_NOT_ONLINE;
	public static String PLAYER_MENTIONED_YOU;
	public static String PLAYER_HEALED_YOU;
	public static String PLAYER_FED_YOU;
	public static String ERROR_CONSOLE_CANNOT_BE_HEALED;
	public static String JOIN_MESSAGE;
	public static String QUIT_MESSAGE;
	public static String YOU_HEALED;
	public static String YOU_FED;
	public static String SUCCESFULLY_CHANGED_EXP;
	public static String YOU_HAVE_BEEN_BANNED;
	public static String YOU_HAVE_BEEN_MUTED;
	public static String YOU_HAVE_BEEN_WARNED;
	public static String SUCCESFULLY_WARNED;
	public static String BC_PREFIX;
	public static String PREFIX;
	
	
	public static void assignStrings(){
		
		BC_PREFIX = ChatColor.translateAlternateColorCodes('&', config.getString("broadcast-prefix"));
		PREFIX = ChatColor.translateAlternateColorCodes('&', config.getString("prefix"));
		PERMISSION_DENIED = PREFIX + ChatColor.translateAlternateColorCodes('&', config.getString("permission-denied"));
		ERROR_PLAYER_NOT_FOUND = PREFIX + ChatColor.translateAlternateColorCodes('&', config.getString("player-not-found"));
		ERROR_PLAYER_MENTION_NOT_ONLINE = PREFIX + ChatColor.translateAlternateColorCodes('&', config.getString("mention-not-online"));
		PLAYER_MENTIONED_YOU = PREFIX + ChatColor.translateAlternateColorCodes('&', config.getString("mention-notification"));
		PLAYER_HEALED_YOU = PREFIX + ChatColor.translateAlternateColorCodes('&', config.getString("heal-notification"));
		PLAYER_FED_YOU = PREFIX + ChatColor.translateAlternateColorCodes('&', config.getString("feed-notification"));
		YOU_HEALED = PREFIX + ChatColor.translateAlternateColorCodes('&', config.getString("you-healed"));
		YOU_FED = PREFIX + ChatColor.translateAlternateColorCodes('&', config.getString("you-fed"));
		SUCCESFULLY_CHANGED_EXP = PREFIX + ChatColor.translateAlternateColorCodes('&', config.getString("change-xp"));
		JOIN_MESSAGE = PREFIX + ChatColor.translateAlternateColorCodes('&', config.getString("join-message"));
		QUIT_MESSAGE = PREFIX + ChatColor.translateAlternateColorCodes('&', config.getString("quit-message"));
		ERROR_CONSOLE_CANNOT_BE_HEALED = PREFIX + ChatColor.translateAlternateColorCodes('&', config.getString("heal-error-console"));
		YOU_HAVE_BEEN_BANNED = PREFIX + ChatColor.translateAlternateColorCodes('&', config.getString("ban-notification"));
		YOU_HAVE_BEEN_MUTED = PREFIX + ChatColor.translateAlternateColorCodes('&', config.getString("mute-notification"));
		YOU_HAVE_BEEN_WARNED = PREFIX + ChatColor.translateAlternateColorCodes('&', config.getString("warn-notification"));
		SUCCESFULLY_WARNED = PREFIX + ChatColor.translateAlternateColorCodes('&', config.getString("warn-notification-mod"));
	}
	
	public static void def(){
		
		config.addDefault("broadcast-prefix", "&6&l[&c&lBroadcast&6&l]&r ");
		config.addDefault("prefix", "&6&l[&c&lJAATP&6&l]&r ");
		config.addDefault("permission-denied", "&cError: Permission denied");
		config.addDefault("player-not-found", "&cError: Player not found");
		config.addDefault("mention-not-online", "&c&lNote: &cThe player you have mentioned is not online.");
		config.addDefault("mention-notification", "&a<PLAYER> mentioned you!");
		config.addDefault("heal-notification", "&a<PLAYER> healed you!");
		config.addDefault("feed-notification", "&a<PLAYER> fed you!");
		config.addDefault("heal-error-console", "&aThe CONSOLE cannot be healed nor fed!");
		config.addDefault("you-healed", "&cYou healed <PLAYER>.");
		config.addDefault("you-fed", "&cYou fed <PLAYER>.");
		config.addDefault("change-xp", "&cSuccesfully changed <PLAYER> experience");
		config.addDefault("join-message", "&c<PLAYER> joined the game.");
		config.addDefault("quit-message", "&c<PLAYER> left the game.");
		config.addDefault("ban-notification", "&cYou have been banned!\nReason: &r<REASON>\n&cExpires in: &r<EXPIRE>");
		config.addDefault("mute-notification", "&cYou have been muted!\nReason: &r<REASON>\n&cExpires in: &r<EXPIRE>");
		config.addDefault("warn-notification", "&cYou have been warned! Reason: &r<REASON>&c. You now have &r<WARNS>&c warnings.");
		config.addDefault("warn-notification-mod", "&cSuccesfully warned <PLAYER> for reason: &r<REASON>&c. Player now has &r<WARNS>&c warnings.");
		
		config.options().copyDefaults(true);
		File msgConfig = new File(Bukkit.getPluginManager().getPlugin("JAATP").getDataFolder() + File.separator + "messages.yml");
		try {
			config.save(msgConfig);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
