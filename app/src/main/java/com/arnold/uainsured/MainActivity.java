package com.arnold.uainsured;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    TextInputLayout phoneInput,passwordInput;
    TextView forgotPassword,registration;
    Button mLogin;

    AlertDialog.Builder dialogBox;
    AlertDialog alertDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneInput = findViewById(R.id.textinput_phone);
        passwordInput = findViewById(R.id.textInput_password);

        forgotPassword = findViewById(R.id.forgot_password);
        registration = findViewById(R.id.registration_text);

        mLogin = findViewById(R.id.login);





        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogBox(R.layout.forgot_password_dialog);
            }
        });


    }

    private void showDialogBox(int layout){

        dialogBox = new AlertDialog.Builder(MainActivity.this);
        View layoutView = getLayoutInflater().inflate(layout,null);

        Button dialogButton = layoutView.findViewById(R.id.submit);
        dialogBox.setView(layoutView);
        alertDialog = dialogBox.create();

        //TODO
        //Circular Animation

        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alertDialog.show();


        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });
    }
}




