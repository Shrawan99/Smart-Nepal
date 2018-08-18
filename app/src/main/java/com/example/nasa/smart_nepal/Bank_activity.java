package com.example.nasa.smart_nepal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ExpandableListView;



public class Bank_activity extends Activity {
    HashMap<String, List<String>> Movies_category;
    List<String> Movies_list;
    ExpandableListView Exp_list;
    BankAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent1 = getIntent();
        setContentView(R.layout.activity_bank_activity);
         Exp_list = (ExpandableListView) findViewById(R.id.exp_list);
        Movies_category = DataBase_Bank.getInfo();
        Movies_list = new ArrayList<String>(Movies_category.keySet());
        adapter = new BankAdapter(this, Movies_category, Movies_list);
        Exp_list.setAdapter(adapter);
    }



}
