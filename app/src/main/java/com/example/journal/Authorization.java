package com.example.journal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Authorization extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autorization);
        Button parents = findViewById(R.id.button4);
        Button children = findViewById(R.id.button3);
        Button teachers = findViewById(R.id.button5);
        Button director = findViewById(R.id.button6);
        parents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переход в следующее активити
                Intent i=new Intent(Authorization.this,Menu.class);
                startActivity(i);
                finish();
            }
        });

        children.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переход в следующее активити
                Intent i=new Intent(Authorization.this,Menu.class);
                startActivity(i);
                finish();
            }
        });
        director.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переход в следующее активити
                Intent i=new Intent(Authorization.this,Director.class);
                startActivity(i);
                finish();
            }
        });

        teachers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переход в следующее активити
                Intent i=new Intent(Authorization.this, Menu2.class);
                startActivity(i);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed(){
        Intent i=new Intent(Authorization.this,MainActivity.class);
        startActivity(i);
        finish();
    }



}
