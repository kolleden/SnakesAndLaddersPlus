package com.example.user1.snakesandladdersplus;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class GameActivity extends AppCompatActivity {
    Random random;
    Button dice;
    boolean redTurn = true;
    Player pRed = new Player(true);
    Player pBlack = new Player(false);
    ImageView[] blackArr;
    ImageView[] redArr;
    SnakesAndLadders[] snakesAndLaddersArr;
    Button Reset;
    SqliteDatabase db;
    ImageView Player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);
        db = new SqliteDatabase(this);
        dice = (Button) findViewById(R.id.dice);
        random = new Random();
        blackArr = new ImageView[50];
        redArr = new ImageView[50];
        Reset = (Button) findViewById(R.id.Replay);
        Reset.setClickable(false);
        Reset.setVisibility(View.INVISIBLE);
        Player = (ImageView) findViewById(R.id.Player);
        Player.setBackgroundResource(R.mipmap.black_player);

        snakesAndLaddersArr = new SnakesAndLadders[9];
        snakesAndLaddersArr[0] = new SnakesAndLadders(6, 13);
        snakesAndLaddersArr[1] = new SnakesAndLadders(22, 4);
        snakesAndLaddersArr[2] = new SnakesAndLadders(9, 29);
        snakesAndLaddersArr[3] = new SnakesAndLadders(18, 34);
        snakesAndLaddersArr[4] = new SnakesAndLadders(39, 21);
        snakesAndLaddersArr[5] = new SnakesAndLadders(48, 24);
        snakesAndLaddersArr[6] = new SnakesAndLadders(33, 41);
        snakesAndLaddersArr[7] = new SnakesAndLadders(11, 8);
        snakesAndLaddersArr[8] = new SnakesAndLadders(21, 36);

        blackArr[0] = (ImageView) findViewById(R.id.b1);
        blackArr[1] = (ImageView) findViewById(R.id.b2);
        blackArr[2] = (ImageView) findViewById(R.id.b3);
        blackArr[3] = (ImageView) findViewById(R.id.b4);
        blackArr[4] = (ImageView) findViewById(R.id.b5);
        blackArr[5] = (ImageView) findViewById(R.id.b6);
        blackArr[6] = (ImageView) findViewById(R.id.b7);
        blackArr[7] = (ImageView) findViewById(R.id.b8);
        blackArr[8] = (ImageView) findViewById(R.id.b9);
        blackArr[9] = (ImageView) findViewById(R.id.b10);
        blackArr[10] = (ImageView) findViewById(R.id.b11);
        blackArr[11] = (ImageView) findViewById(R.id.b12);
        blackArr[12] = (ImageView) findViewById(R.id.b13);
        blackArr[13] = (ImageView) findViewById(R.id.b14);
        blackArr[14] = (ImageView) findViewById(R.id.b15);
        blackArr[15] = (ImageView) findViewById(R.id.b16);
        blackArr[16] = (ImageView) findViewById(R.id.b17);
        blackArr[17] = (ImageView) findViewById(R.id.b18);
        blackArr[18] = (ImageView) findViewById(R.id.b19);
        blackArr[19] = (ImageView) findViewById(R.id.b20);
        blackArr[20] = (ImageView) findViewById(R.id.b21);
        blackArr[21] = (ImageView) findViewById(R.id.b22);
        blackArr[22] = (ImageView) findViewById(R.id.b23);
        blackArr[23] = (ImageView) findViewById(R.id.b24);
        blackArr[24] = (ImageView) findViewById(R.id.b25);
        blackArr[25] = (ImageView) findViewById(R.id.b26);
        blackArr[26] = (ImageView) findViewById(R.id.b27);
        blackArr[27] = (ImageView) findViewById(R.id.b28);
        blackArr[28] = (ImageView) findViewById(R.id.b29);
        blackArr[29] = (ImageView) findViewById(R.id.b30);
        blackArr[30] = (ImageView) findViewById(R.id.b31);
        blackArr[31] = (ImageView) findViewById(R.id.b32);
        blackArr[32] = (ImageView) findViewById(R.id.b33);
        blackArr[33] = (ImageView) findViewById(R.id.b34);
        blackArr[34] = (ImageView) findViewById(R.id.b35);
        blackArr[35] = (ImageView) findViewById(R.id.b36);
        blackArr[36] = (ImageView) findViewById(R.id.b37);
        blackArr[37] = (ImageView) findViewById(R.id.b38);
        blackArr[38] = (ImageView) findViewById(R.id.b39);
        blackArr[39] = (ImageView) findViewById(R.id.b40);
        blackArr[40] = (ImageView) findViewById(R.id.b41);
        blackArr[41] = (ImageView) findViewById(R.id.b42);
        blackArr[42] = (ImageView) findViewById(R.id.b43);
        blackArr[43] = (ImageView) findViewById(R.id.b44);
        blackArr[44] = (ImageView) findViewById(R.id.b45);
        blackArr[45] = (ImageView) findViewById(R.id.b46);
        blackArr[46] = (ImageView) findViewById(R.id.b47);
        blackArr[47] = (ImageView) findViewById(R.id.b48);
        blackArr[48] = (ImageView) findViewById(R.id.b49);
        blackArr[49] = (ImageView) findViewById(R.id.b50);

        redArr[0] = (ImageView) findViewById(R.id.r1);
        redArr[1] = (ImageView) findViewById(R.id.r2);
        redArr[2] = (ImageView) findViewById(R.id.r3);
        redArr[3] = (ImageView) findViewById(R.id.r4);
        redArr[4] = (ImageView) findViewById(R.id.r5);
        redArr[5] = (ImageView) findViewById(R.id.r6);
        redArr[6] = (ImageView) findViewById(R.id.r7);
        redArr[7] = (ImageView) findViewById(R.id.r8);
        redArr[8] = (ImageView) findViewById(R.id.r9);
        redArr[9] = (ImageView) findViewById(R.id.r10);
        redArr[10] = (ImageView) findViewById(R.id.r11);
        redArr[11] = (ImageView) findViewById(R.id.r12);
        redArr[12] = (ImageView) findViewById(R.id.r13);
        redArr[13] = (ImageView) findViewById(R.id.r14);
        redArr[14] = (ImageView) findViewById(R.id.r15);
        redArr[15] = (ImageView) findViewById(R.id.r16);
        redArr[16] = (ImageView) findViewById(R.id.r17);
        redArr[17] = (ImageView) findViewById(R.id.r18);
        redArr[18] = (ImageView) findViewById(R.id.r19);
        redArr[19] = (ImageView) findViewById(R.id.r20);
        redArr[20] = (ImageView) findViewById(R.id.r21);
        redArr[21] = (ImageView) findViewById(R.id.r22);
        redArr[22] = (ImageView) findViewById(R.id.r23);
        redArr[23] = (ImageView) findViewById(R.id.r24);
        redArr[24] = (ImageView) findViewById(R.id.r25);
        redArr[25] = (ImageView) findViewById(R.id.r26);
        redArr[26] = (ImageView) findViewById(R.id.r27);
        redArr[27] = (ImageView) findViewById(R.id.r28);
        redArr[28] = (ImageView) findViewById(R.id.r29);
        redArr[29] = (ImageView) findViewById(R.id.r30);
        redArr[30] = (ImageView) findViewById(R.id.r31);
        redArr[31] = (ImageView) findViewById(R.id.r32);
        redArr[32] = (ImageView) findViewById(R.id.r33);
        redArr[33] = (ImageView) findViewById(R.id.r34);
        redArr[34] = (ImageView) findViewById(R.id.r35);
        redArr[35] = (ImageView) findViewById(R.id.r36);
        redArr[36] = (ImageView) findViewById(R.id.r37);
        redArr[37] = (ImageView) findViewById(R.id.r38);
        redArr[38] = (ImageView) findViewById(R.id.r39);
        redArr[39] = (ImageView) findViewById(R.id.r40);
        redArr[40] = (ImageView) findViewById(R.id.r41);
        redArr[41] = (ImageView) findViewById(R.id.r42);
        redArr[42] = (ImageView) findViewById(R.id.r43);
        redArr[43] = (ImageView) findViewById(R.id.r44);
        redArr[44] = (ImageView) findViewById(R.id.r45);
        redArr[45] = (ImageView) findViewById(R.id.r46);
        redArr[46] = (ImageView) findViewById(R.id.r47);
        redArr[47] = (ImageView) findViewById(R.id.r48);
        redArr[48] = (ImageView) findViewById(R.id.r49);
        redArr[49] = (ImageView) findViewById(R.id.r50);

        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rand = random.nextInt(5);

                switch (rand){
                    case 0:
                        dice.setBackgroundResource(R.mipmap.dice_1);
                        break;
                    case 1:
                        dice.setBackgroundResource(R.mipmap.dice_2);
                        break;
                    case 2:
                        dice.setBackgroundResource(R.mipmap.dice_3);
                        break;
                    case 3:
                        dice.setBackgroundResource(R.mipmap.dice_4);
                        break;
                    case 4:
                        dice.setBackgroundResource(R.mipmap.dice_5);
                        break;
                    case 5:
                        dice.setBackgroundResource(R.mipmap.dice_6);
                        break;
                }

                if (redTurn) {
                    move(pBlack, rand + 1, blackArr);
                    Player.setBackgroundResource(R.mipmap.red_player);
                }
                else {
                    move(pRed, rand + 1, redArr);
                    Player.setBackgroundResource(R.mipmap.black_player);
                }

                redTurn = !redTurn;
            }
        });

        Reset.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                blackArr[pBlack.getLocation()].setBackgroundResource(0);
                redArr[pRed.getLocation()].setBackgroundResource(0);
                pRed.setLocation(0);
                pBlack.setLocation(0);
                blackArr[pBlack.getLocation()].setBackgroundResource(R.mipmap.black_dot);
                redArr[pRed.getLocation()].setBackgroundResource(R.mipmap.red_dot);
                Reset.setClickable(false);
                Reset.setVisibility(View.INVISIBLE);
                dice.setClickable(true);
                Snackbar snackbar = Snackbar
                        .make(v, "The Game Has Been Reset!", Snackbar.LENGTH_SHORT);
                View sbView = snackbar.getView();
                TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
                textView.setTextColor(Color.GREEN);
                snackbar.show();
            }
        });
    }


    public void move(Player player, int move, ImageView[] view) {
        int add = player.getLocation() + move;
        view[player.getLocation()].setBackgroundResource(0);

        if (player.getLocation() + move >= 50) {
            add = 49;
            Toast toast = Toast.makeText(GameActivity.this, player.isPlayer() ? "Red Player Won!" : "Black Player Won!", Toast.LENGTH_LONG);
            toast.show();
            dice.setClickable(false);
            Reset.setClickable(true);
            Reset.setVisibility(View.VISIBLE);

        }

        view[add].setBackgroundResource(player.isPlayer() ? R.mipmap.red_dot : R.mipmap.black_dot);
        player.setLocation(add);
        if(redTurn)
        checkSnakes(pRed, snakesAndLaddersArr);
          else
           checkSnakes(pBlack, snakesAndLaddersArr);
    }


    public void checkSnakes(Player player, SnakesAndLadders[] snakeLocations)
    {
        for (int i = 0; i < snakeLocations.length; i++) {
            if(player.getLocation() == snakeLocations[i].getStartLocation())
                if(redTurn) {
                    snakeOrLaddar(player, redArr, snakeLocations[i].getEndLocation());
                }
                else
                    snakeOrLaddar(player, blackArr, snakeLocations[i].getEndLocation());

        }
    }

    public void snakeOrLaddar(Player player, ImageView[] view, int location)
    {
        view[player.getLocation()].setBackgroundResource(0);
        if(redTurn) {
            view[location].setBackgroundResource(R.mipmap.red_dot);
        }
        else
            {
            view[location].setBackgroundResource(R.mipmap.black_dot);
        }
        player.setLocation(location);
    }


}