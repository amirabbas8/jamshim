package com.tameshkim.jamshim;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ImageView icon = (ImageView) findViewById(R.id.icon);
        YoYo.with(Techniques.RotateInDownLeft).duration(700).repeat(0).playOn(icon);
        TextView text = (TextView) findViewById(R.id.text);
        YoYo.with(Techniques.RotateInDownLeft).duration(700).repeat(0).playOn(text);
       final boolean isLogged = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getBoolean("isLogged", false);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (isLogged) {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    finish();
                }else{
                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                    finish();
                }
            }
        }, 1000);

    }
}
