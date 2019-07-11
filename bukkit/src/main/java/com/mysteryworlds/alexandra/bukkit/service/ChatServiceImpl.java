package com.mysteryworlds.alexandra.bukkit.service;

import com.mysteryworlds.alexandra.bukkit.repository.ChatUserRepository;
import java.util.UUID;

public class ChatServiceImpl implements ChatService {

  private final ChatUserRepository userRepository;

  public ChatServiceImpl(
      ChatUserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public String getUserPrefix(UUID uniqueId) {
    return null;
  }

  @Override
  public void setUserPrefix(UUID uniqueId, String prefix) {

  }

  @Override
  public String getUserSuffix(UUID uniqueId) {
    return null;
  }

  @Override
  public void setUserSuffix(UUID uniqueId, String suffix) {

  }

  @Override
  public String getGroupPrefix(String group) {
    return null;
  }

  @Override
  public void setGroupPrefix(String group, String prefix) {

  }

  @Override
  public String getGroupSuffix(String group) {
    return null;
  }

  @Override
  public void setGroupSuffix(String group, String suffix) {

  }
}
