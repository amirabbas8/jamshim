package com.tameshkim.jamshim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    private EditText usernameText;
    private EditText mobileText;
    private EditText passwordText;
    private Button signUpButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        usernameText = (EditText) findViewById(R.id.input_username);
        mobileText = (EditText) findViewById(R.id.input_mobile);
        passwordText = (EditText) findViewById(R.id.input_password);
        signUpButton = (Button) findViewById(R.id.btn_signup);
        TextView loginLink = (TextView) findViewById(R.id.link_login);

        usernameText.requestFocus();
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });

        loginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Finish the registration screen and return to the Login activity
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
            }
        });
    }

    public void signUp() {

        if (validate()) {

            signUpButton.setEnabled(false);
           startActivity(new Intent(this,MainActivity.class));
        finish();
        }


    }


    public boolean validate() {
        boolean valid = true;

        String username = usernameText.getText().toString();
        String mobile = mobileText.getText().toString();
        String password = passwordText.getText().toString();

        if (username.isEmpty() ) {
            usernameText.setError("نام کاربری را وارد کنید");
            valid = false;
        } else {
            usernameText.setError(null);
        }


        if (!username.matches("[A-Za-z0-9_]+")) {
            usernameText.setError("نام کاربری معتبر نیست");
            valid = false;
        }


        if (mobile.isEmpty() || mobile.length() != 10) {

            passwordText.setError("شماره همراه ده رقمی را وارد کنید");
            valid = false;
        } else {
            mobileText.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {

            passwordText.setError("رمز عبور را وارد کنید");
            valid = false;
        } else {
            passwordText.setError(null);
        }


        return valid;
    }
}