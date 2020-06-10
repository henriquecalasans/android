package com.example.eventhandling;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends DebugActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //Receive name sent by parameter
        Bundle args = getIntent().getExtras();

        //Defined key
        String name = args.getString("name");

        //Update view with Welcome message text
        TextView tw = findViewById(R.id.tw_welcome);
        tw.setText(name + R.string.welcome);
    }



}