package com.example.nick.pinkpalace;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toolbar;

public class MyActivity extends Activity
{





    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);



        ImageButton next = findViewById(R.id.pinkpImageButton);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), pinkpalace.class);
                startActivityForResult(myIntent, 0);
            }

        });


    }
}

