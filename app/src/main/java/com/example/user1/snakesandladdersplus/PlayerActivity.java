package com.example.user1.snakesandladdersplus;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

/**
 * Created by USER1 on 20/02/2017.
 */
public class PlayerActivity extends GameActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);



        dice = (Button) findViewById(R.id.dice);


        dice.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                if (!blackTurn) {
                    rand = random.nextInt(5);
                    if (rand == 0) {
                        dice.setBackgroundResource(R.mipmap.dice_1);
                    }
                    if (rand == 1) {
                        dice.setBackgroundResource(R.mipmap.dice_2);
                    }
                    if (rand == 2) {
                        dice.setBackgroundResource(R.mipmap.dice_3);
                    }
                    if (rand == 3) {
                        dice.setBackgroundResource(R.mipmap.dice_4);
                    }
                    if (rand == 4) {
                        dice.setBackgroundResource(R.mipmap.dice_5);
                    }
                    if (rand == 5) {
                        dice.setBackgroundResource(R.mipmap.dice_6);
                    }

                    Move(Pred, rand, Red);
                    blackTurn = true;
                }
            }
        });


    }

    public void Move(Player player, int move, ImageView[] view) {
        if ((player.getLocation() + move) >= 50) {
            while (player.getLocation() != 50) {
                view[player.getLocation()].setBackgroundResource(0);
                view[player.getLocation() + 1].setBackgroundResource(R.mipmap.red_dot);
                player.setLocation(player.getLocation() + 1);
                SystemClock.sleep(1000);

            }
            //victory massage red
        } else {
            for (int i = 0; i < move; i++) {

                view[player.getLocation() + i].setBackgroundResource(0);
                view[player.getLocation() + i + 1].setBackgroundResource(R.mipmap.red_dot);
                SystemClock.sleep(1000);
            }

            player.setLocation(player.getLocation() + move);
        }
    }
}
