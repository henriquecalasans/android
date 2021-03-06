package com.example.eventhandling;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends DebugActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(onClickLogin());


    }

    private View.OnClickListener onClickLogin() {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Check input
                EditText et_login = findViewById(R.id.et_login);
                EditText et_password = findViewById(R.id.et_password);

                String login = et_login.getText().toString().toUpperCase().trim();
                String password = et_password.getText().toString().toUpperCase().trim();

                if (login.equals("HENRIQUE") && password.equals("123")) {
                    alert("Bem vindo, login realizado com sucesso!");

                    //Create Intent
                    Intent intent = new Intent(getApplicationContext(), WelcomeActivity.class);
                    //Bundle params = new Bundle();

                    //Create key, value for another activity and send parameters
                    //params.putString("name", login);
                    intent.putExtra("name", login);

                    //send parameters
                    //intent.putExtras(params);

                    //Start Activity
                    startActivity(intent);

                } else {
                    if (login.equals("") && password.equals("")) {
                        alert("Por favor, insira as informações de login");
                    } else {
                        alert("Login e senha incorretos");
                    }

                }


            }

        };

    }

    public void callObservationScreen(View view) {
        Intent intent = new Intent(getApplicationContext(), ObservationScreenActivity.class);
        startActivity(intent);
        alert("Tela de Observação chamada");
    }

    public void callFrameLayoutScreen(View view) {
        Intent intent = new Intent(getApplicationContext(), FrameLayout.class);
        startActivity(intent);
        alert("Tela de Frame layout chamada");
    }

    //Show message
    private void alert(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }


    public void callHelloFragmentsScreen(View view) {
        Intent intent = new Intent(getApplicationContext(), HelloFragments.class);
        startActivity(intent);
    }
}


