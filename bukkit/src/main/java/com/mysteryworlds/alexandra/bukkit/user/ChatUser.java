package com.mysteryworlds.alexandra.bukkit.user;

import java.util.Map;
import java.util.UUID;

public class ChatUser {

  private UUID uniqueId;
  private Map<String, Object> meta;

  public ChatUser() {
  }

  public ChatUser(UUID uniqueId, Map<String, Object> meta) {
    this.uniqueId = uniqueId;
    this.meta = meta;
  }

  public UUID getUniqueId() {
    return uniqueId;
  }

  public Map<String, Object> getMeta() {
    return meta;
  }
}
