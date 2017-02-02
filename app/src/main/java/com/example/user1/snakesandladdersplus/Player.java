package com.example.user1.snakesandladdersplus;

/**
 * Created by USER1 on 02/02/2017.
 */
public class Player {
    private  int location;
    private  int powerup1;
    private  int powerup2;

    public Player() {
        this.location = 1;
        this.powerup1 = 0;
        this.powerup2 = 0;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getPowerup1() {
        return powerup1;
    }

    public void setPowerup1(int powerup1) {
        this.powerup1 = powerup1;
    }

    public int getPowerup2() {
        return powerup2;
    }

    public void setPowerup2(int powerup2) {
        this.powerup2 = powerup2;
    }
}
