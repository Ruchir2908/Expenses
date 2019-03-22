package com.example.caatulgupta.xpenses;

import android.opengl.ETC1;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class EditDetailsActivity extends AppCompatActivity {

    EditText titleEditText, nameEditText, amountEditText, dateEditText, timeEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        titleEditText = findViewById(R.id.detailsTitleEditText);
        nameEditText = findViewById(R.id.detailsNameEditText);
        amountEditText = findViewById(R.id.detailsAmountEditText);
        dateEditText = findViewById(R.id.detailsDateEditText);
        timeEditText = findViewById(R.id.detailsTimeEditText);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
////                        .setAction("Action", null).show();
//
//
//
//            }
//        });
    }

}
