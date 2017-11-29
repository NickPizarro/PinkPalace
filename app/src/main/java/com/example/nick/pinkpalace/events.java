package com.example.nick.pinkpalace;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton next = findViewById(R.id.earlylearnerImageButton);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), earlyscience.class);
                startActivityForResult(myIntent, 0);
            }

        });

        //This code is what allows the app to go to the next view when clicked
        next = findViewById(R.id.santalandImageButton);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), santalanding.class);
                startActivityForResult(myIntent, 0);
            }

        });

        //This code is what allows the app to go to the next view when clicked
        next = findViewById(R.id.harrypotterImageButton);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), harrypotter.class);
                startActivityForResult(myIntent, 0);
            }

        });

        //This code is what allows the app to go to the next view when clicked
        next = findViewById(R.id.scienceofbeerImageButton);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), beer.class);
                startActivityForResult(myIntent, 0);
            }

        });


    }
}
