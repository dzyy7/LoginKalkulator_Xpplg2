package com.example.latihanandroidxpplg2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUsername;
    EditText txtPassword;
    Button btnLogin;
    Button btnRegist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        txtUsername = findViewById(R.id.txtuser);
        txtPassword = findViewById(R.id.txtpass);
        btnLogin = findViewById(R.id.btnlog);
        btnRegist = findViewById(R.id.btnRegist);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, txtUsername.getText().toString(), Toast.LENGTH_LONG).show();
                String username = txtUsername.getText().toString();
                String password = txtUsername.getText().toString();

                if(username.equals("admin") && password.equals("admin")){
                    Intent intent = new Intent(MainActivity.this, Kalkulator.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "Login Gagal", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}