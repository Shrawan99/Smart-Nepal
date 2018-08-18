package com.example.nasa.smart_nepal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ExpandableListView;



public class HospitalActivity extends Activity {
    HashMap<String, List<String>> Hospital_category;
    List<String> Hospital_list;
    ExpandableListView Exp_list_hospital;
    HospitalAdapter adapter_hotel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent1 = getIntent();
        setContentView(R.layout.activity_hospital);
        Exp_list_hospital = (ExpandableListView) findViewById(R.id.exp_list_hospital);
        Hospital_category = DataBase_Hospital.getInfo();
        Hospital_list = new ArrayList<String>(Hospital_category.keySet());
        adapter_hotel = new HospitalAdapter(this, Hospital_category, Hospital_list);
        Exp_list_hospital.setAdapter(adapter_hotel);
    }



}
