package com.example.user1.snakesandladdersplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;


public class GameActivity extends AppCompatActivity {
    Random random;
    Button dice;
    int rand;
    boolean yourTurn;
    Player Pred;
    Player Pblack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);

         dice = (Button) findViewById(R.id.dice);


        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(yourTurn) {
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
                    Pblack.setLocation(Pblack.getLocation() + rand);

                }

            }




        });



    }

        public void Move(Player player)
        {

        }

}

