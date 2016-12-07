package com.example.tmbeamm.lovecal;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int rCal = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fb1 = (FloatingActionButton) findViewById(R.id.floatingActionButton3);
        fb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AddCal.class);
                startActivity(intent);
                finish();

            }
        });

        TextView tv1 = (TextView)findViewById(R.id.textView);

        Intent it2 = getIntent();
        int rFood = it2.getIntExtra("vCal",0);
        rCal+=rFood;

        tv1.setText("Calorie = "+rCal);
    }


}
