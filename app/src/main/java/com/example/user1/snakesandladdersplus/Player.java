package com.example.user1.snakesandladdersplus;

/**
 * Created by USER1 on 02/02/2017.
 */
public class Player {
    private int location;
    private boolean player;

    public Player(boolean player) {
        this.player = player;
    }

    public boolean isPlayer() {
        return player;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }
}