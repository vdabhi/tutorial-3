package com.example.tutorial_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class after_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_after_login );
        Toast.makeText(getApplicationContext(), "Welcome",Toast.LENGTH_LONG).show();

    }
}