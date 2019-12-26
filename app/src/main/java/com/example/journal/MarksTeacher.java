package com.example.journal;

import android.os.Bundle;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class MarksTeacher extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marksteacher);
    }
    @Override
    public void onBackPressed(){
        Intent i=new Intent(MarksTeacher.this,Menu2.class);
        startActivity(i);
        finish();
    }
}
