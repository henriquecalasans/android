package com.example.eventhandling;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class WelcomeActivity extends DebugActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //Create object to Actionbar Class
        ActionBar actionBar = getSupportActionBar();

        //Get intent
        Intent intent = getIntent();

        //Read key
        Bundle args = intent.getExtras();

        //Read Key value
        String name = args.getString("name");

        //Update view with Welcome message text
        TextView tw = findViewById(R.id.tw_welcome);
        String welcome = getString(R.string.welcome);
        tw.setText(welcome + ", " + name);


        //Enable action bar to function up navigation
       // actionBar.setDisplayHomeAsUpEnabled(true);

        //Remove title
       // actionBar.setDisplayShowTitleEnabled(false);



        //
    }

    //Create action bar and inflate menu xml
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    //Enable button up navigation
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            finish();

            //Enable function button 1 from action bar
        } else if (id == R.id.button1) {
            String button1_msg = getString(R.string.action_bar_button1);
            toast(button1_msg);

        }
        return super.onOptionsItemSelected(item);
    }


    //Create message
    private void toast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}