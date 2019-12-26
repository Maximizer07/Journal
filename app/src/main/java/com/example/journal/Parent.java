package com.example.journal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Parent extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.raspisanie);

        final String IP = "18106b85-1286-4504-9805-ec5578984669";
        Socket s;
        Scanner in;
        PrintWriter out;
        final int port = 2019;
      //  s = new Socket(IP, port);
      //  out = new PrintWriter(s.getOutputStream());
      //  in = new Scanner(s.getInputStream());
     /*  Button registr=findViewById(R.id.button);
       Button vhod=findViewById(R.id.button2);

        vhod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переход в следующее активити
                Intent i=new Intent(ParentsRoom.this,Autoriz.class);
                startActivity(i);
                finish();
            }
        });

        registr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переход в следующее активити
                Intent i=new Intent(ParentsRoom.this,Registr.class);
                startActivity(i);
                finish();
            }
        });

        vhod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переход в следующее активити
                Intent i=new Intent(ParentsRoom.this,Autoriz.class);
                startActivity(i);
                finish();
            }
        });

        vhod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переход в следующее активити
                Intent i=new Intent(ParentsRoom.this,Autoriz.class);
                startActivity(i);
                finish();
            }
        });

        vhod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переход в следующее активити
                Intent i=new Intent(ParentsRoom.this,Autoriz.class);
                startActivity(i);
                finish();
            }
        });

        vhod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переход в следующее активити
                Intent i=new Intent(ParentsRoom.this,Autoriz.class);
                startActivity(i);
                finish();
            }
        });

        vhod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //переход в следующее активити
                Intent i=new Intent(ParentsRoom.this,Autoriz.class);
                startActivity(i);
                finish();
            }
        });
*/
    }
    @Override
    public void onBackPressed(){
        Intent i=new Intent(Parent.this,Menu.class);
        startActivity(i);
        finish();
    }

}
