package com.example.journal;

import android.os.Bundle;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class Marks extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marks);
    }
    @Override
    public void onBackPressed(){
        Intent i=new Intent(Marks.this,Menu.class);
        startActivity(i);
        finish();
    }
}
