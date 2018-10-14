package com.example.user.greenelf;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Welcome extends AppCompatActivity {

    private static int SPASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(Welcome.this, LoginActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },SPASH_TIME_OUT);
    }
}
