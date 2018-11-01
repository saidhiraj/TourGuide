package com.example.android.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Shopping_malls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);
        ArrayList<Word> shopping_mallsw = new ArrayList<Word>();
        shopping_mallsw.add(new Word("Hyderabad Central",R.drawable.hyderabadcentral));
        shopping_mallsw.add(new Word("Inorbit Mall",R.drawable.inorbitmall));
        shopping_mallsw.add(new Word("Big Bazaar",R.drawable.bigbazaar));
        shopping_mallsw.add(new Word("Brand Factory",R.drawable.brandfactory));
        shopping_mallsw.add(new Word("Chennai Shopping Mall",R.drawable.chennaishoppingmall));
        shopping_mallsw.add(new Word("Forum Sujana Mall",R.drawable.forumshoppingmall));
        shopping_mallsw.add(new Word("Chandana Brothers",R.drawable.chandanabrothers));
        shopping_mallsw.add(new Word("Inox-GVKone",R.drawable.inox_gvkone));
        shopping_mallsw.add(new Word("Joyalukkas",R.drawable.joyalukkas));
        shopping_mallsw.add(new Word("Khazana Jewellery",R.drawable.khazanajewellery));
        shopping_mallsw.add(new Word("South India Shopping Mall",R.drawable.southindiashoppingmall));
        com.example.android.tourguide.Wordadapter adapter = new com.example.android.tourguide.Wordadapter(this,shopping_mallsw);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setBackgroundColor(getResources().getColor(R.color.category_shopping_malls));
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
