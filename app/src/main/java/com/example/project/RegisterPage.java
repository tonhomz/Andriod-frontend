package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterPage extends AppCompatActivity {

    String email = "";
    String username = "";
    String password = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        EditText emailInput = findViewById(R.id.editTextEmail);
        emailInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().isEmpty()) {

                } else {
                    email = s.toString();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        EditText usernameInput = findViewById(R.id.usernameInput);
        usernameInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().isEmpty()) {

                } else {
                    username = s.toString();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        EditText passwordInput = findViewById(R.id.passwordInput);
        passwordInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().isEmpty()) {

                } else {
                    password = s.toString();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        Button register = findViewById(R.id.registerButton2);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homePage = new Intent(RegisterPage.this, HomePage.class);
                startActivity(homePage);
            }
        });
    }
}