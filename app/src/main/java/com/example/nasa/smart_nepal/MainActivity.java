package com.example.nasa.smart_nepal;
import com.example.nasa.smart_nepal.R;

import android.app.ActionBar;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.Toast;

public class MainActivity extends Activity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TabHost tabHost=(TabHost) findViewById(R.id.tabhost);
        tabHost.setup();

        //Home Tab Processing
        ImageButton vegetables = (ImageButton) findViewById(R.id.vegetable);
        ImageButton exchanges =(ImageButton) findViewById(R.id.exchange);
        ImageButton petrols =(ImageButton) findViewById(R.id.petrol);
        ImageButton transports =(ImageButton) findViewById(R.id.transport);
        //spec1.setIndicator("Home", getResources().getDrawable(R.drawable.icon_photos_tab));
        TabSpec spec1 = tabHost.newTabSpec("Home");
        spec1.setContent(R.id.home);
        spec1.setIndicator("Home", null);
        tabHost.addTab(spec1);

        //Extras Tab processing
        ImageButton torch=(ImageButton) findViewById(R.id.torch);
        TabSpec spec2 = tabHost.newTabSpec("Extras");
        spec2.setContent(R.id.extras);
        spec2.setIndicator("Extras", null);
        tabHost.addTab(spec2);
        //torch


        //About Tab processing

        TabSpec spec3 = tabHost.newTabSpec("About");
        spec3.setContent(R.id.about);
        spec3.setIndicator("About", null);
        tabHost.addTab(spec3);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    //Image Listener starts from here
    public void helpMe(View view){
        Intent intent=new Intent(this, torchActivity.class);
        startActivity(intent);
    }
    public void vegetable_click(View view) {

        Intent intent1 = new Intent(this, Vegetables.class);
        startActivity(intent1);
    }
    public void power_click(View view){

        Intent intent1=new Intent(this, Loadsheding.class);
        startActivity(intent1);
    }
    public void exchange_click(View view){

        Intent intent1=new Intent(this, Exchange_Rates.class);
        startActivity(intent1);

    }
    public void bank_click(View view){
        Intent intent1=new Intent(this, Bank_activity.class);
        startActivity(intent1);



    }
    public void petrol_click(View view){

        Intent intent1=new Intent(this, PetroleumOil.class);
        startActivity(intent1);


    }
    public void hotel_click(View view){
        Intent intent=new Intent(this,HotelActivity.class);
        startActivity(intent);


    }
    public void hospital_click(View view){
        Intent intent1=new Intent(this, HospitalActivity.class);
        startActivity(intent1);

    }
    public void watersupply_click(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dropbox.com/sh/3g3og9ws61qjc5r/AAD8GlhequUzTMiQQnZPn7R3a?dl=1"));
        startActivity(browserIntent);
        Toast.makeText(MainActivity.this,"Downloading....",Toast.LENGTH_LONG).show();

    }
    public void telephone_click(View view){
        Intent intent=new Intent(this,telephoneActivity.class);
        startActivity(intent);
        //Toast.makeText(MainActivity.this,"Shrawan Raut:9849866268\nPuspha Raj Pandey:9849603591\nRam P.d Gajurel:9808995543\nPrabin Upreti:9841186190",Toast.LENGTH_LONG).show();

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_main_settings) {
            System.exit(0);

         Toast.makeText(MainActivity.this,"       Sorry\nRates can't update from Main menu..\n\nPlease go inside of any tab and update'",Toast.LENGTH_LONG).show();

            return true;
        }
        if(id==R.id.how_use){
            Intent intent=new Intent(this,How_to_use.class);
            startActivity(intent);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
