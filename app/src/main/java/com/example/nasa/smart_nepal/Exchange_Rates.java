package com.example.nasa.smart_nepal;

import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nasa.smart_nepal.serverupdate;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.util.Date;


public class Exchange_Rates extends serverUpdate_exchange {


    TextView[] exchangeRatesName = new TextView[16];
    TextView[] exchangeRatesPrice = new TextView[16];


    public void exchange_rates_update() {
        SharedPreferences vegetablePreferences = getSharedPreferences("msettings",0);
        for(int i = 1; i < 16 ; i++) {
            int resIdName = getResources().getIdentifier("exchange_rates_textView"+(i+1),"id","com.example.nasa.smart_nepal");
            int resIdPrice = getResources().getIdentifier("exchange_rates_editText"+(i+1),"id","com.example.nasa.smart_nepal");
            exchangeRatesName[i] = (TextView) findViewById(resIdName);
            exchangeRatesPrice[i] = (TextView) findViewById(resIdPrice);
            exchangeRatesName[i].setText(vegetablePreferences.getString("EXCHANGERATESNAME"+String.valueOf(i), "Not Found"));
            exchangeRatesPrice[i].setText(String.valueOf(vegetablePreferences.getString("EXCHANGERATESPRICE"+String.valueOf(i), "")));
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange__rates);


        exchange_rates_update();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_exchange__rates, menu);
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
            update_exchange();
            exchange_rates_update();
            return true;
        }
        if(id==R.id.action_time){
            //String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
             String time1="";
            String ayo=time(time1);
            Toast.makeText(Exchange_Rates.this, ayo,Toast.LENGTH_LONG).show();
        return  true;
        }


        return super.onOptionsItemSelected(item);
    }
}
