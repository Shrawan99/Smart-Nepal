package com.example.nasa.smart_nepal;

import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nasa.smart_nepal.serverupdate;

import java.text.DateFormat;
import java.util.Date;


public class PetroleumOil extends serverOfPetrol{


    TextView[] petroleumOilDepotName = new TextView[1];
    TextView[] petroleumOilPetrol = new TextView[1];
    TextView[] petroleumOilDiesel = new TextView[1];
    TextView[] petroleumOilLpg = new TextView[1];

    public void petroleum_oil_update() {
        SharedPreferences vegetablesPreferences = getSharedPreferences("msettings",0);
        for(int i = 0; i < 1 ; i++) {
            int resIdDepotName = getResources().getIdentifier("petroleumOil_textView0"+(i+3),"id","com.example.nasa.smart_nepal");
            int resIdPetrol = getResources().getIdentifier("petroleumOil_textView1"+(i+3),"id","com.example.nasa.smart_nepal");
            int resIdDiesel = getResources().getIdentifier("petroleumOil_textView2"+(i+3),"id","com.example.nasa.smart_nepal");
            int resIdLpg = getResources().getIdentifier("petroleumOil_textView3"+(i+3),"id","com.example.nasa.smart_nepal");
            petroleumOilDepotName[i] = (TextView) findViewById(resIdDepotName);
            petroleumOilPetrol[i] = (TextView) findViewById(resIdPetrol);
            petroleumOilDiesel[i] = (TextView) findViewById(resIdDiesel);
            petroleumOilLpg[i] = (TextView) findViewById(resIdLpg);
            petroleumOilDepotName[i].setText(vegetablesPreferences.getString("PETROLEUMOILDEPOTNAME"+String.valueOf(i), "ERROR"));
            petroleumOilPetrol[i].setText(String.valueOf(vegetablesPreferences.getString("PETROLEUMOILPETROL"+String.valueOf(i), "0")));
            petroleumOilDiesel[i].setText(String.valueOf(vegetablesPreferences.getString("PETROLEUMOILDIESEL"+String.valueOf(i), "0")));
            petroleumOilLpg[i].setText(String.valueOf(vegetablesPreferences.getString("PETROLEUMOILLPG"+String.valueOf(i), "0")));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petroleum_oil);


        petroleum_oil_update();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_petroleum_oil, menu);
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
            update_petrol();
            petroleum_oil_update();
            return true;
        }
        if(id==R.id.action_time){
            String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
            Toast.makeText(PetroleumOil.this, currentDateTimeString, Toast.LENGTH_LONG).show();

            return  true;
        }

        return super.onOptionsItemSelected(item);
    }
}
