package com.codersam.samrat.toursandtravels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
LinearLayout hotels, restaurants, flight, places;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hotels = findViewById(R.id.hotelBook);
        restaurants = findViewById(R.id.resturantBook);
        flight = findViewById(R.id.flightBook);
        places = findViewById(R.id.placesBook);

        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Under Construction",Toast.LENGTH_SHORT).show();
            }
        });
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Under Construction",Toast.LENGTH_SHORT).show();
            }
        });
        places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Under Construction",Toast.LENGTH_SHORT).show();
            }
        });
        flight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoFlight = new Intent(MainActivity.this,Flight.class);
                startActivity(gotoFlight);
            }
        });
    }
}
