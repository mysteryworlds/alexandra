package com.mysteryworlds.alexandra.bukkit.vault;

import com.mysteryworlds.alexandra.bukkit.service.ChatService;
import com.mysteryworlds.alexandra.bukkit.utils.BukkitUtils;
import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.plugin.Plugin;

import java.util.UUID;

public class VaultChat extends Chat {

    private final Plugin plugin;
    private final Permission permission;
    private final ChatService chatService;

    public VaultChat(Plugin plugin, Permission permission, ChatService chatService) {
        super(permission);
        this.plugin = plugin;
        this.permission = permission;
        this.chatService = chatService;
    }

    @Override
    public String getName() {

        return plugin.getName();
    }

    @Override
    public boolean isEnabled() {

        return plugin.isEnabled();
    }

    @Override
    public String getPlayerPrefix(String world, String player) {

        UUID uniqueId = BukkitUtils.getUniqueId(player);
        return chatService.getUserPrefix(uniqueId);
    }

    @Override
    public void setPlayerPrefix(String world, String player, String prefix) {

        UUID uniqueId = BukkitUtils.getUniqueId(player);
        chatService.setUserPrefix(uniqueId, prefix);
    }

    @Override
    public String getPlayerSuffix(String world, String player) {

        UUID uniqueId = BukkitUtils.getUniqueId(player);
        return chatService.getUserSuffix(uniqueId);
    }

    @Override
    public void setPlayerSuffix(String world, String player, String suffix) {

        UUID uniqueId = BukkitUtils.getUniqueId(player);
        chatService.setUserSuffix(uniqueId, suffix);
    }

    @Override
    public String getGroupPrefix(String world, String group) {

        return chatService.getGroupPrefix(group);
    }

    @Override
    public void setGroupPrefix(String world, String group, String prefix) {

        chatService.setGroupPrefix(group, prefix);
    }

    @Override
    public String getGroupSuffix(String world, String group) {

        return chatService.getGroupSuffix(group);
    }

    @Override
    public void setGroupSuffix(String world, String group, String suffix) {

        chatService.setGroupSuffix(group, suffix);
    }

    @Override
    public int getPlayerInfoInteger(String world, String player, String node, int defaultValue) {

        return 0;
    }

    @Override
    public void setPlayerInfoInteger(String world, String player, String node, int value) {

    }

    @Override
    public int getGroupInfoInteger(String world, String group, String node, int defaultValue) {
        return 0;
    }

    @Override
    public void setGroupInfoInteger(String world, String group, String node, int value) {

    }

    @Override
    public double getPlayerInfoDouble(String world, String player, String node, double defaultValue) {
        return 0;
    }

    @Override
    public void setPlayerInfoDouble(String world, String player, String node, double value) {

    }

    @Override
    public double getGroupInfoDouble(String world, String group, String node, double defaultValue) {
        return 0;
    }

    @Override
    public void setGroupInfoDouble(String world, String group, String node, double value) {

    }

    @Override
    public boolean getPlayerInfoBoolean(String world, String player, String node, boolean defaultValue) {
        return false;
    }

    @Override
    public void setPlayerInfoBoolean(String world, String player, String node, boolean value) {

    }

    @Override
    public boolean getGroupInfoBoolean(String world, String group, String node, boolean defaultValue) {
        return false;
    }

    @Override
    public void setGroupInfoBoolean(String world, String group, String node, boolean value) {

    }

    @Override
    public String getPlayerInfoString(String world, String player, String node, String defaultValue) {
        return null;
    }

    @Override
    public void setPlayerInfoString(String world, String player, String node, String value) {

    }

    @Override
    public String getGroupInfoString(String world, String group, String node, String defaultValue) {
        return null;
    }

    @Override
    public void setGroupInfoString(String world, String group, String node, String value) {

    }
}
