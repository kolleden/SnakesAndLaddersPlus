package com.example.user1.snakesandladdersplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button rules, scoreboard, login, play;
    Boolean LoggedOn = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rules = (Button) findViewById(R.id.rules);
        scoreboard = (Button) findViewById(R.id.scoreboard);
        login = (Button) findViewById(R.id.login);
        play = (Button) findViewById(R.id.play);



        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(!LoggedOn) {
                    Intent intentLogin = new Intent(MainActivity.this, LoginScreen.class);
                    startActivity(intentLogin);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Your Already Logged On!", Toast.LENGTH_SHORT).show();

                }

            }
        });

        play.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               if(LoggedOn)
               {
                   Intent intentPlay = new Intent(MainActivity.this, GameActivity.class);
                   startActivity(intentPlay);
               }
                else
               {
                   Toast.makeText(MainActivity.this, "Your Not Logged On!", Toast.LENGTH_SHORT).show();
               }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
