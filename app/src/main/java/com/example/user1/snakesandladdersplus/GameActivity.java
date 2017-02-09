package com.example.user1.snakesandladdersplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.Window;
import android.view.WindowManager;
import android.content.pm.ActivityInfo;

import java.util.Random;


public class GameActivity extends AppCompatActivity {
    Random random;
    Button dice;
    int rand;
    boolean BlackTurn;
    Player Pred;
    Player Pblack;
    ImageView[] Black;
    ImageView[] Red;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        dice = (Button) findViewById(R.id.dice);

        Black[0] = (ImageView) findViewById(R.id.b1);
        Black[1] = (ImageView) findViewById(R.id.b2);
        Black[2] = (ImageView) findViewById(R.id.b3);
        Black[3] = (ImageView) findViewById(R.id.b4);
        Black[4] = (ImageView) findViewById(R.id.b5);
        Black[5] = (ImageView) findViewById(R.id.b6);
        Black[6] = (ImageView) findViewById(R.id.b7);
        Black[7] = (ImageView) findViewById(R.id.b8);
        Black[8] = (ImageView) findViewById(R.id.b9);
        Black[9] = (ImageView) findViewById(R.id.b10);
        Black[10] = (ImageView) findViewById(R.id.b11);
        Black[11] = (ImageView) findViewById(R.id.b12);
        Black[12] = (ImageView) findViewById(R.id.b13);
        Black[13] = (ImageView) findViewById(R.id.b14);
        Black[14] = (ImageView) findViewById(R.id.b15);
        Black[15] = (ImageView) findViewById(R.id.b16);
        Black[16] = (ImageView) findViewById(R.id.b17);
        Black[17] = (ImageView) findViewById(R.id.b18);
        Black[18] = (ImageView) findViewById(R.id.b19);
        Black[19] = (ImageView) findViewById(R.id.b20);
        Black[20] = (ImageView) findViewById(R.id.b21);
        Black[21] = (ImageView) findViewById(R.id.b22);
        Black[22] = (ImageView) findViewById(R.id.b23);
        Black[23] = (ImageView) findViewById(R.id.b24);
        Black[024] = (ImageView) findViewById(R.id.b25);
        Black[25] = (ImageView) findViewById(R.id.b26);
        Black[26] = (ImageView) findViewById(R.id.b27);
        Black[27] = (ImageView) findViewById(R.id.b28);
        Black[28] = (ImageView) findViewById(R.id.b29);
        Black[29] = (ImageView) findViewById(R.id.b30);
        Black[30] = (ImageView) findViewById(R.id.b31);
        Black[31] = (ImageView) findViewById(R.id.b32);
        Black[32] = (ImageView) findViewById(R.id.b33);
        Black[33] = (ImageView) findViewById(R.id.b34);
        Black[34] = (ImageView) findViewById(R.id.b35);
        Black[35] = (ImageView) findViewById(R.id.b36);
        Black[36] = (ImageView) findViewById(R.id.b37);
        Black[37] = (ImageView) findViewById(R.id.b38);
        Black[38] = (ImageView) findViewById(R.id.b39);
        Black[39] = (ImageView) findViewById(R.id.b40);
        Black[40] = (ImageView) findViewById(R.id.b41);
        Black[41] = (ImageView) findViewById(R.id.b42);
        Black[42] = (ImageView) findViewById(R.id.b43);
        Black[43] = (ImageView) findViewById(R.id.b44);
        Black[44] = (ImageView) findViewById(R.id.b45);
        Black[45] = (ImageView) findViewById(R.id.b46);
        Black[46] = (ImageView) findViewById(R.id.b47);
        Black[47] = (ImageView) findViewById(R.id.b48);
        Black[48] = (ImageView) findViewById(R.id.b49);
        Black[49] = (ImageView) findViewById(R.id.b50);

        Red[0] = (ImageView) findViewById(R.id.r1);
        Red[1] = (ImageView) findViewById(R.id.r2);
        Red[2] = (ImageView) findViewById(R.id.r3);
        Red[3] = (ImageView) findViewById(R.id.r4);
        Red[4] = (ImageView) findViewById(R.id.r5);
        Red[5] = (ImageView) findViewById(R.id.r6);
        Red[6] = (ImageView) findViewById(R.id.r7);
        Red[7] = (ImageView) findViewById(R.id.r8);
        Red[8] = (ImageView) findViewById(R.id.r9);
        Red[9] = (ImageView) findViewById(R.id.r10);
        Red[10] = (ImageView) findViewById(R.id.r11);
        Red[11] = (ImageView) findViewById(R.id.r12);
        Red[12] = (ImageView) findViewById(R.id.r13);
        Red[13] = (ImageView) findViewById(R.id.r14);
        Red[14] = (ImageView) findViewById(R.id.r15);
        Red[15] = (ImageView) findViewById(R.id.r16);
        Red[16] = (ImageView) findViewById(R.id.r17);
        Red[17] = (ImageView) findViewById(R.id.r18);
        Red[18] = (ImageView) findViewById(R.id.r19);
        Red[19] = (ImageView) findViewById(R.id.r20);
        Red[20] = (ImageView) findViewById(R.id.r21);
        Red[21] = (ImageView) findViewById(R.id.r22);
        Red[22] = (ImageView) findViewById(R.id.r23);
        Red[23] = (ImageView) findViewById(R.id.r24);
        Red[024] = (ImageView) findViewById(R.id.r25);
        Red[25] = (ImageView) findViewById(R.id.r26);
        Red[26] = (ImageView) findViewById(R.id.r27);
        Red[27] = (ImageView) findViewById(R.id.r28);
        Red[28] = (ImageView) findViewById(R.id.r29);
        Red[29] = (ImageView) findViewById(R.id.r30);
        Red[30] = (ImageView) findViewById(R.id.r31);
        Red[31] = (ImageView) findViewById(R.id.r32);
        Red[32] = (ImageView) findViewById(R.id.r33);
        Red[33] = (ImageView) findViewById(R.id.r34);
        Red[34] = (ImageView) findViewById(R.id.r35);
        Red[35] = (ImageView) findViewById(R.id.r36);
        Red[36] = (ImageView) findViewById(R.id.r37);
        Red[37] = (ImageView) findViewById(R.id.r38);
        Red[38] = (ImageView) findViewById(R.id.r39);
        Red[39] = (ImageView) findViewById(R.id.r40);
        Red[40] = (ImageView) findViewById(R.id.r41);
        Red[41] = (ImageView) findViewById(R.id.r42);
        Red[42] = (ImageView) findViewById(R.id.r43);
        Red[43] = (ImageView) findViewById(R.id.r44);
        Red[44] = (ImageView) findViewById(R.id.r45);
        Red[45] = (ImageView) findViewById(R.id.r46);
        Red[46] = (ImageView) findViewById(R.id.r47);
        Red[47] = (ImageView) findViewById(R.id.r48);
        Red[48] = (ImageView) findViewById(R.id.r49);
        Red[49] = (ImageView) findViewById(R.id.r50);




        dice.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
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
                if (BlackTurn) {
                    MoveB(Pblack, rand, Black);
                } else
                    MoveR(Pred, rand, Red);

            }


        });


    }

    public void MoveB(Player player, int move, ImageView[] view) {
        if ((player.getLocation() + move) >= 50) {
            while (player.getLocation() != 50) {
                view[player.getLocation()].setBackground(null);
                view[player.getLocation() + 1].setBackgroundResource(R.mipmap.black_dot);
                player.setLocation(player.getLocation() + 1);
            }
            //victory massage black
        } else {
            for (int i = 0; i < move; i++) {

                view[player.getLocation() + i].setBackground(null);
                view[player.getLocation() + i + 1].setBackgroundResource(R.mipmap.black_dot);
                //make a 1 second pause
            }

            player.setLocation(player.getLocation() + move);
        }


    }

    public void MoveR(Player player, int move, ImageView[] view) {
        if ((player.getLocation() + move) >= 50) {
            while (player.getLocation() != 50) {
                view[player.getLocation()].setBackground(null);
                view[player.getLocation() + 1].setBackgroundResource(R.mipmap.red_dot);
                player.setLocation(player.getLocation() + 1);
            }
            //victory massage red
        } else {
            for (int i = 0; i < move; i++) {

                view[player.getLocation() + i].setBackground(null);
                view[player.getLocation() + i + 1].setBackgroundResource(R.mipmap.red_dot);
                //make a 1 second pause
            }

            player.setLocation(player.getLocation() + move);
        }


    }
}

