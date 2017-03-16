package com.example.user1.snakesandladdersplus;

/**
 * Created by USER1 on 16/03/2017.
 */
public class SnakesAndLadders {
    private int startLocation;
    private int endLocation;

    public SnakesAndLadders(int startLocation, int endLocation) {
        this.startLocation = startLocation;
        this.endLocation = endLocation;
    }

    public int getStartLocation() {
        return startLocation;
    }


    public int getEndLocation() {
        return endLocation;
    }
}
