package com.example.nasa.smart_nepal;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

/**
 * Created NASA.
 */
public class serverupdate extends Activity {

    String url = "http://kalimatimarket.com.np/home/rpricelist";
    String url2 = "http://nrb.org.np/fxmexchangerate1.php";
  //String url3 = "http://www.nepaloil.com.np/Selling-Price/13/";
    String url3 = "http://www.nepaloil.com.np/Monthly-Profit-and-Loss-Details/17//";
    Document doc,doc2,doc3;




//    static int flag1=0;

    private class MyTask extends AsyncTask<String, Void, String[]> {

        ProgressDialog prog;

        String title = "";
        String title2 = "";
        String title3 = "";


        @Override

        protected void onPreExecute() {
            prog = new ProgressDialog(serverupdate.this);
            prog.setMessage("Connecting to Server of Ultimate Way for Vegetables rates....");
            prog.show();
        }
        @Override
        protected String[] doInBackground(String... params) {
            String[] tarrays = new String[0];
            String[] tarrays2 = new String[0];
            String[] tarrays3 = new String[0];


            try {
                doc = Jsoup.connect(url).get();
                doc2 = Jsoup.connect(url2).get();
                doc3 = Jsoup.connect(url3).get();
                SharedPreferences vegetablePreferences = getSharedPreferences("msettings",0);
                SharedPreferences.Editor editor = vegetablePreferences.edit();

                for(int i=0;i<57;i++) {
                    Element tableElement = doc.body().select("tr").get(i);
                    title = tableElement.text();
                    tarrays = title.split(" ");
                    if(tarrays.length ==5) {
                        tarrays[0] = tarrays[0];
                        tarrays[4] = "Rs."+tarrays[4];//+"/"+tarrays[2];
                    }
                    if(tarrays.length ==6) {
                        tarrays[0] = tarrays[0]+" "+tarrays[1];
                        tarrays[4] = "Rs."+tarrays[5];//+"/"+tarrays[2];
                    }
                    if(tarrays.length ==7) {
                        tarrays[0] = tarrays[0]+" "+tarrays[1]+" "+tarrays[2];
                        tarrays[4] = "Rs."+tarrays[6];//+"/"+tarrays[3];
                    }
                    if(tarrays.length ==8) {
                        tarrays[0] = tarrays[0]+" "+tarrays[1]+" "+tarrays[2]+" "+tarrays[3];
                        tarrays[4] = "Rs."+tarrays[7];//+"/"+tarrays[3];
                    }
                    if(tarrays.length ==9) {
                        tarrays[0] = tarrays[0]+" "+tarrays[1]+" "+tarrays[2]+" "+tarrays[3]+" "+tarrays[4];
                        tarrays[4] = "Rs."+tarrays[8];//+"/"+tarrays[3];
                    }
                    if(tarrays.length ==10) {
                        tarrays[0] = tarrays[0]+" "+tarrays[1]+" "+tarrays[2]+" "+tarrays[3]+" "+tarrays[4]+" "+tarrays[5];
                        tarrays[4] = "Rs."+tarrays[9];//+"/"+tarrays[3];
                    }


                    editor.putString("VEGETABLESNAME"+String.valueOf(i),tarrays[0]);
                    editor.putString("VEGETABLESPRICE"+String.valueOf(i),(tarrays[4]).toString());
                }/*
                for(int k=0;k<16;k++) {
                    Element tableElement = doc2.body().select("tr").get(50+k);
                    title2 = tableElement.text();
                    tarrays2 = title2.split(" ");
                    if(tarrays2.length ==4) {
//                        tarrays2[0] = tarrays2[0]+" "+tarrays2[1];
                        tarrays2[1] = "Selling/"+tarrays2[1];//tarrays2[3];
                        editor.putString("EXCHANGERATESPRICE"+String.valueOf(k),tarrays2[1].toString());

                    }
                    if(tarrays2.length ==5) {
                        tarrays2[0] = tarrays2[0]+" "+tarrays2[1];
                        tarrays2[2] = "Rs."+tarrays2[4]+" / "+tarrays2[2];
                        editor.putString("EXCHANGERATESPRICE"+String.valueOf(k),tarrays2[2].toString());

                    }
                    if(tarrays2.length ==6) {
                        tarrays2[0] = tarrays2[0]+" "+tarrays2[1]+" "+tarrays2[2];
                        tarrays2[3] = "Rs."+tarrays2[5]+" / "+tarrays2[3];
                        editor.putString("EXCHANGERATESPRICE"+String.valueOf(k),tarrays2[3].toString());
                    }
                    editor.putString("EXCHANGERATESNAME"+String.valueOf(k),tarrays2[0]);
//                    editor.putString("EXCHANGERATESPRICE"+String.valueOf(k),tarrays2[2].toString());
                }
                for(int j=0;j<1;j++) {
                    Element tableElement = doc3.body().select("tr").get(j+26);
                    title3 = tableElement.text();
                    tarrays3 = title3.split(" ");
                    editor.putString("PETROLEUMOILDEPOTNAME"+String.valueOf(j),tarrays3[0].toString());
                    editor.putString("PETROLEUMOILPETROL"+String.valueOf(j),tarrays3[3].toString());
                    editor.putString("PETROLEUMOILDIESEL"+String.valueOf(j),tarrays3[4].toString());
                    editor.putString("PETROLEUMOILLPG"+String.valueOf(j),tarrays3[8].toString());
                }*/
                editor.apply();

            } catch (IOException e) {
                e.printStackTrace();

            }
            return tarrays;
        }

        @Override
        protected void onPostExecute(String[] tarrays) {
            super.onPostExecute(tarrays);
            prog.dismiss();


        }
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        String date=currentDateTimeString;
        String time=date;
    }

    public void update() {
        new MyTask().execute(url);
    }

    public String time(String date){
        date=new MyTask().time;
        return date;

    }

}
