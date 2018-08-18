package com.example.nasa.smart_nepal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ExpandableListView;



public class HotelActivity extends Activity {
    HashMap<String, List<String>> Hotel_category;
    List<String> Hotel_list;
    ExpandableListView Exp_list_hotel;
    HotelAdapter adapter_hotel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent1 = getIntent();
        setContentView(R.layout.activity_hotel);
        Exp_list_hotel = (ExpandableListView) findViewById(R.id.exp_list_hotel);
        Hotel_category = DataBase_Hotel.getInfo();
        Hotel_list = new ArrayList<String>(Hotel_category.keySet());
        adapter_hotel = new HotelAdapter(this, Hotel_category, Hotel_list);
        Exp_list_hotel.setAdapter(adapter_hotel);
    }



}
