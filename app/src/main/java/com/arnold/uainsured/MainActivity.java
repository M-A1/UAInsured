package com.arnold.uainsured;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    TextInputLayout phoneInput,passwordInput;
    TextView forgotPassword,registration;
    Button mLogin;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneInput = findViewById(R.id.textinput_phone);
        passwordInput = findViewById(R.id.textInput_password);

        forgotPassword = findViewById(R.id.forgot_password);
        registration = findViewById(R.id.registration_text);

        mLogin = findViewById(R.id.login);

        //Listener for loginButton
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}