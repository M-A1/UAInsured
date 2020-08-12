package com.arnold.uainsured;

import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passwordUtil {

    public Pattern patternPassword;
    public Matcher matcherPassword;



    private static final String PASSWORD_REGEX =  "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})";

    public void passwordValidate(String password, TextInputLayout mPassword){

        patternPassword = Pattern.compile(PASSWORD_REGEX);

        matcherPassword = patternPassword.matcher(password);

        if(!matcherPassword.matches()){

            mPassword.setError("Password must include special characters,uppercase,and number");

        }else if(password.isEmpty()){
            mPassword.setError("Enter password");
        }

    }


}
