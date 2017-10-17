package com.example.jonba_000.wydapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class First_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__page);
    }

    /* Called when the user taps the Login button */
    public void Login(View view) {
        Intent intent = new Intent(this, WYDLogin.class);
        startActivity(intent);
    }
}
