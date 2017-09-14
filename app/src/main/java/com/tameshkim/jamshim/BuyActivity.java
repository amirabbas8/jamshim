package com.tameshkim.jamshim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.tameshkim.jamshim.R;

public class BuyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        ((CheckBox) findViewById(R.id.buy_checkbox)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Button mButton = (Button) findViewById(R.id.buy_button);
                if ( isChecked )
                {
                    mButton.setEnabled(true);

                }else{
                    mButton.setEnabled(false);
            }
        }});
    }
}
