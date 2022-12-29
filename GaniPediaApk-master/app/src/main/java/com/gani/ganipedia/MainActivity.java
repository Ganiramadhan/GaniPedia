package com.gani.ganipedia;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.content.Intent;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int waktu_loading = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent (MainActivity.this, login.class);
                startActivity(home);
                finish();
            }
        },waktu_loading);
    }
}

