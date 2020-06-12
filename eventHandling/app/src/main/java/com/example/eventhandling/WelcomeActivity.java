package com.example.eventhandling;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends DebugActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //Get intent
        Intent intent = getIntent();

        //Read parameters
        Bundle args = intent.getExtras();

        //Recieve Bundle key
        String name = args.getString("name");

        //Update view with Welcome message text
        TextView tw = findViewById(R.id.tw_welcome);
        String welcome = getString(R.string.welcome);
        tw.setText(welcome + ", " + name);
    }


}