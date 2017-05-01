package com.example.user1.snakesandladdersplus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;




public class MainActivity extends AppCompatActivity {
    Button scoreboard, play;
    Boolean LoggedOn = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreboard = (Button) findViewById(R.id.scoreboard);
        play = (Button) findViewById(R.id.play);



        play.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                    Intent intentLogin = new Intent(MainActivity.this, GameActivity.class);
                    startActivity(intentLogin);
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
