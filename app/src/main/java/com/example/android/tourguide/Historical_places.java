package com.example.android.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Historical_places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);
        ArrayList<Word> historical_placesw = new ArrayList<Word>();
        historical_placesw.add(new Word("Charminar",R.drawable.charminar));
        historical_placesw.add(new Word("Golconda",R.drawable.golconda));
        historical_placesw.add(new Word("Qutub Shahi Tombs",R.drawable.qutubshahitombs));
        historical_placesw.add(new Word("Salar Jung Museum",R.drawable.salarjungmuseum));
        historical_placesw.add(new Word("Chowmahalla Palace",R.drawable.chowmahallapalace));
        historical_placesw.add(new Word("Faluknama Palace",R.drawable.falaknama));
        historical_placesw.add(new Word("Mecca Masjid",R.drawable.meccamasjid));
        historical_placesw.add(new Word("Birla Mandir",R.drawable.birlamandir));
        historical_placesw.add(new Word("Masjid-e-jama",R.drawable.masjid_e_jama));
        historical_placesw.add(new Word("Nizam's Silver Jubilee Museum",R.drawable.nizams_silver_jubilee_museum));
        historical_placesw.add(new Word("Taramati Baradari",R.drawable.taramatibaradari));
        com.example.android.tourguide.Wordadapter adapter = new com.example.android.tourguide.Wordadapter(this,historical_placesw);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setBackgroundColor(getResources().getColor(R.color.category_historical_places));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word cur_word =(Word) adapterView.getItemAtPosition(i);
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(cur_word.geteng()+",Hyderabad"));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
    }
}
