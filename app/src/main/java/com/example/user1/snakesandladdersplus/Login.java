package com.example.user1.snakesandladdersplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.EditText;

public class Login extends AppCompatActivity
{
    EditText BlackName = (EditText) findViewById(R.id.NameBlack);
    EditText BlackPass = (EditText) findViewById(R.id.passwordblack);
    EditText RedName = (EditText) findViewById(R.id.NameRed);
    EditText RedPass = (EditText) findViewById(R.id.passwordred);

    ImageView BlackPlayer = (ImageView) findViewById(R.id.BlackFace);
    ImageView RedPlayer = (ImageView) findViewById(R.id.RedFace);


}