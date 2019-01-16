package com.example.caatulgupta.xpenses;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView titleTextView, nameTextView, amountTextView, dateTextView, timeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        titleTextView = findViewById(R.id.detailsTitleTextView);
        nameTextView = findViewById(R.id.detailsNameTextView);
        amountTextView = findViewById(R.id.detailsAmountTextView);
        dateTextView = findViewById(R.id.detailsDateTextView);
        timeTextView = findViewById(R.id.detailsTimeTextView);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();

//                Intent intent = new Intent(DetailsActivity.this, EditDetailsActivity.class);

            }
        });
    }

}
