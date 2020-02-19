package com.example.nick.pinkpalace;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.VideoView;

import com.example.nick.pinkpalace.R;
import com.example.nick.pinkpalace.ppNavigtation;

public class pinkpalace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pinkpalace);


        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.pp);


        //This code is what allows the app to go to the next view when clicked
        Button next = findViewById(R.id.exploreButton);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), ppNavigtation.class);
                startActivityForResult(myIntent, 0);
            }

        });
    }


}
