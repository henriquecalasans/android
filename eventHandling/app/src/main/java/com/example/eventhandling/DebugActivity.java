package com.example.eventhandling;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class DebugActivity extends AppCompatActivity {
    protected static final String TAG = "livro";

    protected void onCreate(Bundle b) {
        super.onCreate(b);
        Log.i(TAG, getClass() + ".On Create chamado" + b);
    }

    protected void onStart() {
        super.onStart();
        Log.i(TAG, getClass() + ".On Start chamado");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, getClass() + ".On Restart chamado");
    }

    protected void onResume() {
        super.onResume();
        Log.i(TAG, getClass() + ".On Resume chamado");
    }

    protected void onPause() {
        super.onPause();
        Log.i(TAG, getClass() + ".On Pause chamado");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, getClass() + ".On SaveInstanceSave() chamado");
    }

    protected void onStop() {
        super.onStop();
        Log.i(TAG, getClass() + ".On Stop chamado");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, getClass() + ".On Destroy chamado");
    }

    private String getClassName() {
        //Return the class name no package
        String s = getClass().getName();
        return s.substring(s.lastIndexOf(" . "));
    }
}
