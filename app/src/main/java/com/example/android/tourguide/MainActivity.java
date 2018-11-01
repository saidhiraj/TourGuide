package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView restaurants =(TextView)findViewById(R.id.restaurants);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent res =new Intent(MainActivity.this,Restaurants.class);
                startActivity(res);
            }
        });

        TextView cinemas =(TextView)findViewById(R.id.cinemas);
        cinemas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cinm =new Intent(MainActivity.this,Cinemas.class);
                startActivity(cinm);
            }
        });
        TextView historical_places =(TextView)findViewById(R.id.historical_places);
        historical_places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hisp =new Intent(MainActivity.this,Historical_places.class);
                startActivity(hisp);
            }
        });
        TextView shopping_malls =(TextView)findViewById(R.id.shopping_malls);
        shopping_malls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shop =new Intent(MainActivity.this,Shopping_malls.class);
                startActivity(shop);
            }
        });
    }
}
