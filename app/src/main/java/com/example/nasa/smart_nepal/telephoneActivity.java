package com.example.nasa.smart_nepal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ExpandableListView;



public class telephoneActivity extends Activity  {
    HashMap<String, List<String>> telephone_category;
    List<String> Telephone_list;
    ExpandableListView Exp_list1;
    TelephoneAdapter adapter1;
    protected Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_telephone);
        mContext = this;
        Exp_list1 = (ExpandableListView) findViewById(R.id.exp_list_telephone);
        telephone_category = Database_Telephone.getInfo();
        Telephone_list = new ArrayList<String>(telephone_category.keySet());
        adapter1 = new TelephoneAdapter(this, telephone_category, Telephone_list);
        Exp_list1.setAdapter(adapter1);
    }



}
