package com.safecrawler.www.nishant.dev.safecrawlerbeta11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.safecrawler.www.nishant.dev.safecrawlerbeta11.StartScreen.StartScreenActivity;

public class CheckIfFirstTimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_if_first_time);

        Intent intent = new Intent(this, StartScreenActivity.class);
        startActivity(intent);
        finish();
    }
}
