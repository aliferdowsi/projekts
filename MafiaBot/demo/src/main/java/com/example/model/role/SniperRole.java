package com.example.model.role;

import com.example.model.player.Player;

public class SniperRole extends Role {
    private Player shottedPlayer;

    public Player getShottedPlayer() {
        return shottedPlayer;
    }

    public void setShottedPlayer(Player shottedPlayer) {
        this.shottedPlayer = shottedPlayer;
    }

    public SniperRole() {
        super("sniper");
    }
    
}
