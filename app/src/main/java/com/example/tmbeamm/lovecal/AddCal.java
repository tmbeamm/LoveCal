package com.example.tmbeamm.lovecal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class AddCal extends AppCompatActivity {


    private Spinner sp1;
    private Button finish_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_cal);

        widget();
        addList();

        finish_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int sendCal = Integer.parseInt(Calfood.Cal(String.valueOf(sp1.getSelectedItem())));

                Intent it1 = new Intent(AddCal.this,MainActivity.class);

                it1.putExtra("vCal",sendCal);
                it1.putExtra("vFood",String.valueOf(sp1.getSelectedItem()));

                startActivity(it1);
                finish();

            }
        });

    }
    private void widget(){
        sp1 = (Spinner)findViewById(R.id.spinner2);
        finish_b = (Button)findViewById(R.id.button);
    }
    private void addList(){

        ArrayList<String> myList = new ArrayList<String>();
        myList.add("ผัดไทย");
        myList.add("ข้าวหมูแดง");
        myList.add("ผัดกระเพรา");

        ArrayAdapter<String> foodAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,myList);
        foodAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(foodAdapter);
    }

}
