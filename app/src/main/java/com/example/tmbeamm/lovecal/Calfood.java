package com.example.tmbeamm.lovecal;

import android.content.Intent;

/**
 * Created by tmbeamm on 12/6/2016 AD.
 */

public class Calfood {

    public static String Cal(String food){
        int value=0;
        String inFood = food;

        if(inFood.equals("ผัดไทย")){value+=10;}
        else if(inFood.equals("ข้าวหมูแดง")){value+=80;}
        else if(inFood.equals("ผัดกระเพรา")){value+=90;}


        return Integer.toString(value);
    }
}
