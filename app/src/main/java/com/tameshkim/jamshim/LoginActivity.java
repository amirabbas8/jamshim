package com.tameshkim.jamshim;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameText;
    private EditText passwordText;
    private Button loginButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        boolean isLogged = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean("isLogged", false);
        if (isLogged) {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }
        usernameText = (EditText) findViewById(R.id.input_username);
        passwordText = (EditText) findViewById(R.id.input_password);
        loginButton = (Button) findViewById(R.id.btn_login);
        TextView signUpLink = (TextView) findViewById(R.id.link_signup);

        usernameText.requestFocus();
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                login();
            }
        });

        signUpLink.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Start the Signup activity
                Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(intent);
                finish();
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
            }
        });
    }

    public void login() {

        if (validate()) {
            PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putBoolean("isLogged", true).apply();

            loginButton.setEnabled(false);
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }


    }


    public boolean validate() {
        boolean valid = true;

        String username = usernameText.getText().toString();
        String password = passwordText.getText().toString();

        if (username.isEmpty()) {
            usernameText.setError("نام کاربری را وارد کنید");
            valid = false;
        } else {
            usernameText.setError(null);
        }


        if (!username.matches("[A-Za-z0-9_]+")) {
            usernameText.setError("نام کاربری معتبر نیست");
            valid = false;
        }

        if (password.isEmpty()) {
            passwordText.setError("رمز عبور را وارد کنید");
            valid = false;
        } else {
            passwordText.setError(null);
        }

        return valid;
    }
}
