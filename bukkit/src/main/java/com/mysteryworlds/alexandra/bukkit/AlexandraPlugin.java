package com.mysteryworlds.alexandra.bukkit;

import com.mysteryworlds.alexandra.bukkit.service.ChatService;
import com.mysteryworlds.alexandra.bukkit.service.ChatServiceImpl;
import com.mysteryworlds.alexandra.bukkit.vault.VaultChat;
import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.permission.Permission;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.ServicePriority;
import org.bukkit.plugin.ServicesManager;
import org.bukkit.plugin.java.JavaPlugin;

public class AlexandraPlugin extends JavaPlugin {

    private ServicesManager servicesManager;
    private ChatService chatService;

    @Override
    public void onEnable() {

        servicesManager = getServer().getServicesManager();

        // Construct service
        chatService = new ChatServiceImpl(null);

        // Register Chat Service
        setupServices();

        // Setup metrics
        setupMetrics();
    }

    @Override
    public void onDisable() {

    }

    private void setupServices() {

        // Get Permission service
        RegisteredServiceProvider<Permission> registration = servicesManager
            .getRegistration(Permission.class);
        if (registration == null) {
            getLogger().severe("Couldn't find permissions. Disabling plugin.");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        Permission permission = registration.getProvider();

        getLogger().info("Hooking into vault.");
        Chat chat = new VaultChat(this, permission, chatService);
        servicesManager.register(Chat.class, chat, this, ServicePriority.Highest);
    }

    private void setupMetrics() {

        new Metrics(this);
    }
}
