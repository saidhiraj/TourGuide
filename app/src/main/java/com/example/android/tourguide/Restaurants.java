package com.example.android.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        ArrayList<Word> restaurants = new ArrayList<Word>();
        restaurants.add(new Word("Barbeque Nation",R.drawable.barbequenation));
        restaurants.add(new Word("Biryani Ghar",R.drawable.biryanighar));
        restaurants.add(new Word("Country Grill",R.drawable.countrygrill));
        restaurants.add(new Word("Jewel of Nizam",R.drawable.jewelofnizam));
        restaurants.add(new Word("Jonathan's Kitchen",R.drawable.jonathanskitchen));
        restaurants.add(new Word("Lemon Tree Premier",R.drawable.lemontree_premier));
        restaurants.add(new Word("Over The Moon",R.drawable.overthemoon));
        restaurants.add(new Word("Paradise",R.drawable.paradise));
        restaurants.add(new Word("Prego",R.drawable.prego));
        restaurants.add(new Word("United Kitchens",R.drawable.unitedkitchens));
        restaurants.add(new Word("Zam Zam Family Dhaba",R.drawable.zamzamfamilydhaba));
        com.example.android.tourguide.Wordadapter adapter = new com.example.android.tourguide.Wordadapter(this,restaurants);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setBackgroundColor(getResources().getColor(R.color.category_restaurants));
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
