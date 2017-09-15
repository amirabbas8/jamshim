package com.tameshkim.jamshim;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BuyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        Bundle bundle = getIntent().getExtras();
        TextView txtName = (TextView) findViewById(R.id.name);
        TextView txtDate = (TextView) findViewById(R.id.date);
        TextView txtTeams = (TextView) findViewById(R.id.teams);
        final TextView txtCount = (TextView) findViewById(R.id.count);
        Button buy = (Button) findViewById(R.id.buy_button);
        String id, name, date, teams;
        id = bundle.getString("id");
        name = bundle.getString("name");
        txtName.setText(name);
        date = bundle.getString("date");
        txtDate.setText(date);
        teams = bundle.getString("teams");
        txtTeams.setText(teams);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c;
                try{

                     c=Integer.parseInt(txtCount.getText().toString());
                }catch (Exception ignored){
                     c=0;
                }
                if ( c> 0)
                    Toast.makeText(BuyActivity.this, "حله دادا برو ببین حالش ببر", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(BuyActivity.this, "دادا چند تا میخوای؟؟", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
