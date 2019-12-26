package com.example.journal;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        Button rasp=findViewById(R.id.button9);
        Button marks=findViewById(R.id.button11);

        rasp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переход в следующее активити
                Intent i=new Intent(Menu.this,Parent.class);
                startActivity(i);
                finish();
            }
        });

        marks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переход в следующее активити
                Intent i=new Intent(Menu.this,Marks.class);
                startActivity(i);
                finish();

            }
        });



    }
    @Override
    public void onBackPressed(){
        Intent i=new Intent(Menu.this,Authorization.class);
        startActivity(i);
        finish();
    }
}
