package com.mysteryworlds.alexandra.bukkit.utils;

import org.bukkit.Bukkit;

import java.util.UUID;

public class BukkitUtils {

    public static UUID getUniqueId(String playerName) {

        return Bukkit.getOfflinePlayer(playerName).getUniqueId();
    }
}
