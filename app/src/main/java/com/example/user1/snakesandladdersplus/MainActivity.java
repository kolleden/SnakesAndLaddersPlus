package com.example.user1.snakesandladdersplus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.support.design.widget.Snackbar;




public class MainActivity extends AppCompatActivity {
    Button sighup, play, Credits;
    Boolean LoggedOn = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sighup = (Button) findViewById(R.id.scoreboard);
        play = (Button) findViewById(R.id.play);
        Credits = (Button) findViewById(R.id.Credits);
        Boolean isSighed = false;


        play.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                    Intent intentLogin = new Intent(MainActivity.this, Login.class);
                    startActivity(intentLogin);
                }
        });

        Credits.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Snackbar snackbar = Snackbar
                        .make(v, "All Credits Go To Eden Ravizki. Contant Via Email Edenravizki@gmail.com", Snackbar.LENGTH_LONG);

                snackbar.show();
            }
        });

        sighup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentSighup = new Intent(MainActivity.this, ScoreboardAndSighup.class);
                startActivity(intentSighup);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}
