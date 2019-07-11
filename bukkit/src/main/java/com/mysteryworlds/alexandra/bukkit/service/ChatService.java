package com.mysteryworlds.alexandra.bukkit.service;

import java.util.UUID;

public interface ChatService {

    /**
     * Get the prefix for the given user.
     *
     * @param uniqueId The unique id of the user.
     * @return The prefix of the user.
     */
    String getUserPrefix(UUID uniqueId);

    /**
     * Set the prefix of the user with the given unique id.
     *
     * @param uniqueId The unique id.
     * @param prefix The prefix.
     */
    void setUserPrefix(UUID uniqueId, String prefix);

    /**
     * Get the suffix for the given user.
     *
     * @param uniqueId The unique id of the user.
     * @return The suffix of the user.
     */
    String getUserSuffix(UUID uniqueId);

    /**
     * Set the suffix of the user with the given unique id.
     *
     * @param uniqueId The unique id.
     * @param suffix The suffix.
     */
    void setUserSuffix(UUID uniqueId, String suffix);

    /**
     * Get the prefix of the given group.
     *
     * @param group The name of the group.
     * @return The prefix.
     */
    String getGroupPrefix(String group);

    /**
     * Set the prefix of the given group.
     *
     * @param group The group.
     * @param prefix The prefix.
     */
    void setGroupPrefix(String group, String prefix);

    /**
     * Get the suffix of a given group.
     *
     * @param group The name of the group.
     * @return The suffix.
     */
    String getGroupSuffix(String group);

    /**
     * Set the prefix of the given group.
     *
     * @param group The name of the group.
     * @param suffix The suffix.
     */
    void setGroupSuffix(String group, String suffix);
}
