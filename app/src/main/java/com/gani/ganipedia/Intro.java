package com.gani.ganipedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class Intro extends AppCompatActivity {
    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        username = (EditText)
                findViewById(R.id.EditTextView_username);
        password = (EditText)
                findViewById(R.id.EditTextView_password);
        btnLogin = (Button)
                findViewById(R.id.ButtonView_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if (usernameKey.equals("adm") && passwordKey.equals("123")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Intro.this, Menu.class);
                    Intro.this.startActivity(intent);
                    finish();
                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Intro.this);
                    builder.setMessage("Username atau Password Anda Salah!").setNegativeButton("Retry", null).create().show();
                }
            }

        });


    }

    public void Dashboard (View view){
        Intent Product = new Intent(Intro.this, Menu.class);
        startActivity(Product);
    }

}