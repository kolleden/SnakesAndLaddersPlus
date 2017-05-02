package com.example.user1.snakesandladdersplus;

import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ScoreboardAndSighup extends AppCompatActivity {
    SqliteDatabase myDb;
    EditText editName, editScore, editTextId;
    Button btnAddData;
    Button btnviewAll;
    Button btnDelete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scoreboard_activity);
        myDb = new SqliteDatabase(this);
        editName = (EditText)findViewById(R.id.editText);
        editScore = (EditText) findViewById(R.id.editScore); 
        editTextId = (EditText)findViewById(R.id.editText_Id);
        btnAddData = (Button)findViewById(R.id.button_add);
        btnviewAll = (Button)findViewById(R.id.button_viewAll);
        btnDelete= (Button)findViewById(R.id.button_delete);

        AddData();
        viewAll();
        DeleteData();
    }
    public void DeleteData() {
        btnDelete.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Integer deletedRows = myDb.deleteData(editTextId.getText().toString());
                        if(deletedRows > 0)
                            Toast.makeText(ScoreboardAndSighup.this,"Data Deleted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(ScoreboardAndSighup.this,"Data not Deleted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public  void AddData() {
        btnAddData.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertData(editName.getText().toString(),
                              editScore.getText().toString());
                        if(isInserted == true)
                            Toast.makeText(ScoreboardAndSighup.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(ScoreboardAndSighup.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void viewAll() {
        btnviewAll.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = myDb.getAllData();
                        if(res.getCount() == 0) {
                            // show message
                            showMessage("Error","Nothing found");
                            return;
                        }

                        StringBuffer StringBuilder = new StringBuffer();
                        while (res.moveToNext()) {
                            StringBuilder.append("Id :"+ res.getString(0)+"\n");
                            StringBuilder.append("Name :"+ res.getString(1)+"\n");
                            StringBuilder.append("Score :"+ res.getString(2)+"\n\n");
                        }

                        // Show all data
                        showMessage("Data",StringBuilder.toString());
                    }
                }
        );
    }

    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }



}

