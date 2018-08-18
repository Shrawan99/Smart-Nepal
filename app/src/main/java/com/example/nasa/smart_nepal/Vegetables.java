package com.example.nasa.smart_nepal;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nasa.smart_nepal.R;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;


public class Vegetables extends serverupdate {

        TextView[] vegetablesName = new TextView[55];
        TextView[] vegetablesPrice = new TextView[55];

        public void vegetables_update() {
            SharedPreferences vegetablesPreferences = getSharedPreferences("msettings", 0);
            for (int i = 0; i < 55; i++) {
                int resIdName = getResources().getIdentifier("vegetables_textView" + (i + 1), "id", "com.example.nasa.smart_nepal");
                int resIdPrice = getResources().getIdentifier("vegetables_editText" + (i + 1), "id", "com.example.nasa.smart_nepal");
                vegetablesName[i] = (TextView) findViewById(resIdName);
                vegetablesPrice[i] = (TextView) findViewById(resIdPrice);
                vegetablesName[i].setText(vegetablesPreferences.getString("VEGETABLESNAME" + String.valueOf(i), "Not Available"));
                vegetablesPrice[i].setText(String.valueOf(vegetablesPreferences.getString("VEGETABLESPRICE" + String.valueOf(i), " ")));
            }
        }


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Intent intent1 = getIntent();
            setContentView(R.layout.activity_vegetables);


            vegetables_update();
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_vegetables, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                //Toast.makeText(Vegetables.this,"Under construction",Toast.LENGTH_LONG).show();
                vegetables_update();
                update();


                return true;
            }
            if(id==R.id.action_time){
                String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
                Toast.makeText(Vegetables.this, currentDateTimeString,Toast.LENGTH_LONG).show();

                return  true;
            }

            return super.onOptionsItemSelected(item);
        }
}
//server update

