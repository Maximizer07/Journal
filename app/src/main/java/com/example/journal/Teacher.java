package com.example.journal;

import android.os.Bundle;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class Teacher extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher);
    }
    @Override
    public void onBackPressed(){
        Intent i=new Intent(Teacher.this,Menu2.class);
        startActivity(i);
        finish();
    }
}
