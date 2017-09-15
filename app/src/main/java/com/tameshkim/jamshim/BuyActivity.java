package com.tameshkim.jamshim;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class BuyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        Bundle bundle=getIntent().getExtras();
        String id=bundle.getString("id");
        String name=bundle.getString("name");
        String date=bundle.getString("date");
        String teams=bundle.getString("teams");
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
