package com.example.user1.snakesandladdersplus;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText BlackId;
    //static int TAKE_PICTURE;
    EditText RedId;
    ImageView BlackPlayer;
    ImageView RedPlayer;
    Button Save;
    SqliteDatabase Db;
    int BId, RId;
    Intent intent;
    Bitmap Black;
    Bitmap Red;
    //Boolean PicWho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        BlackId = (EditText) findViewById(R.id.IdBlack);
        RedId = (EditText) findViewById(R.id.IdRed);
        BlackPlayer = (ImageView) findViewById(R.id.BlackFace);
        RedPlayer = (ImageView) findViewById(R.id.RedFace);
        Save = (Button) findViewById(R.id.Saveplayers);
        Db = new SqliteDatabase(this);
        intent = new Intent(Login.this, GameActivity.class);


        CheckID();
        /*/
        BlackPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                PicWho = false;
                startActivityForResult(intent, TAKE_PICTURE);
            }
        })

        RedPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                PicWho = true;
                startActivityForResult(intent, TAKE_PICTURE);
            }
        });*/

    }



    public void CheckID() {
        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BId = Integer.parseInt(BlackId.getText().toString());
                RId = Integer.parseInt(RedId.getText().toString());
                Cursor res = Db.getAllId();
                Cursor redCopy = res;
                if (res.getCount() == 0) {
                    // show message
                    Toast.makeText(Login.this, "Error, No users found", Toast.LENGTH_SHORT).show();
                    return;
                }

                while (res.moveToNext()) {
                    int resNum = Integer.parseInt(res.getString(0));
                    if (BId == resNum) ;
                    {
                        while (redCopy.moveToNext()) {
                            int resCopyNum = Integer.parseInt(res.getString(0));
                            if (RId == resCopyNum) ;
                            {
                                startActivity(intent);
                            }
                        }


                    }

                }
                Toast.makeText(Login.this, "Not Real User Data.", Toast.LENGTH_LONG).show();
            }
        });
    }
    /* protected void onActivityResult(int requestCode, int resultCode, Intent intent)
    {
        if (requestCode == TAKE_PICTURE && resultCode == RESULT_OK && intent != null)
        {
            if(PicWho)
            {
                Red = (Bitmap) intent.getExtras().get("data");
                RedPlayer.setImageBitmap(Red);
            }
            else
            {
                Black = (Bitmap) intent.getExtras().get("data");
                BlackPlayer.setImageBitmap(Black);
            }
        }
    }*/
}

