package com.example.android.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Cinemas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);
        ArrayList<Word> cinemasw = new ArrayList<Word>();
        cinemasw.add(new Word("Asian GPR Multiplex",R.drawable.asian_gpr_multiplex));
        cinemasw.add(new Word("Bhramaramba",R.drawable.bhramaramba));
        cinemasw.add(new Word("Cinepolis",R.drawable.cinepolis));
        cinemasw.add(new Word("Eeshwar",R.drawable.eeshwar));
        cinemasw.add(new Word("Forum Sujana Mall",R.drawable.forummall));
        cinemasw.add(new Word("Gokul Theatre",R.drawable.gokultheatre));
        cinemasw.add(new Word("Inox-GVKone",R.drawable.inox_gvkone));
        cinemasw.add(new Word("Sandhya",R.drawable.sandhya));
        cinemasw.add(new Word("ShivaParvathi",R.drawable.shivaparvathi));
        cinemasw.add(new Word("Sitara",R.drawable.sitara));
        cinemasw.add(new Word("Sudharshan",R.drawable.sudhrashan));
        final com.example.android.tourguide.Wordadapter adapter = new com.example.android.tourguide.Wordadapter(this,cinemasw);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setBackgroundColor(getResources().getColor(R.color.category_cinemas));
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
