package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    /**
     * Keys
     */
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";


    /**
     * Log lib
     */
    private static final String TAG = "livro";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG,"Log de verbose");
        Log.d(TAG,"Log de Debug");
        Log.i(TAG,"Log de Information");
        Log.w(TAG,"Log de Warning");
        Log.e(TAG,"Log de Error", new RuntimeException("Teste de erro"));

    }

    /**
     * Called when the user taps the Send button
     */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        //Variables
        EditText editText = findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }





}
