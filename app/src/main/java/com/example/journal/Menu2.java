package com.example.journal;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Menu2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu2);
        Button rasp=findViewById(R.id.button50);
        Button marks=findViewById(R.id.button51);

        rasp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переход в следующее активити
                Intent i=new Intent(Menu2.this,Teacher.class);
                startActivity(i);
                finish();
            }
        });

        marks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переход в следующее активити
                Intent i=new Intent(Menu2.this,MarksTeacher.class);
                startActivity(i);
                finish();

            }
        });



    }
    @Override
    public void onBackPressed(){
        Intent i=new Intent(Menu2.this,Authorization.class);
        startActivity(i);
        finish();
    }
}
