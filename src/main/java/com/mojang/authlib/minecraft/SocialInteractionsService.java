package com.mojang.authlib.minecraft;

import java.util.UUID;

public interface SocialInteractionsService {
    public boolean serversAllowed();

    public boolean realmsAllowed();

    public boolean chatAllowed();

    public boolean isBlockedPlayer(UUID var1);
}
