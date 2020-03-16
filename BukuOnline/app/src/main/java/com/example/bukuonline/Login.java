package com.example.bukuonline;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);

            username = (EditText) findViewById(R.id.email);
            password = (EditText) findViewById(R.id.password);
            btnLogin = (Button) findViewById(R.id.login);

//        txtEmail.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                txtEmail.setText("andre@gmail.com");
//            }
//        });

            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if (username.getText().toString().equals("")) {
                        username.setError("Masukan Email Anda");
                    } else if (password.getText().toString().equals("")) {
                        password.setError("Masukan Password Anda");
                    } else {
                        if (username.getText().toString().equals("andre") &&
                                password.getText().toString().equals("123")) {

                            Toast.makeText(getApplicationContext(), "Login Sukses",
                                    Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(Login.this, Menu.class);
                            Login.this.startActivity(intent);
                            finish();
                        } else {
                            AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                            builder.setMessage("Username ata Password Anda Salah!")
                                    .setNegativeButton("rety", null).create().show();
                        }
                    }
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
