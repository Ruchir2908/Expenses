package com.example.caatulgupta.xpenses;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton floatingActionButton;
    RecyclerView recyclerView;
    XpensesAdapter adapter;
    ArrayList<Xpense> Xpenses = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        floatingActionButton = findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AddXpenseActivity.class);
                startActivityForResult(intent,1);

//                AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
//                builder.setMessage("Add Expense");
//                builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//
//                    }
//                });
//                builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//
//                    }
//                });
//                builder.setView(R.layout.dialog_add_expense);
////                builder.setView(R.layout.activity_add_xpense);
//                AlertDialog dialog = builder.create();
//                dialog.show();
            }
        });

//        listView = findViewById(R.id.listView);
        recyclerView = findViewById(R.id.recyclerView);
        adapter = new XpensesAdapter(this,Xpenses);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if(requestCode==1 && resultCode==2){
            String XpenseName = intent.getStringExtra("Name");
            Xpense xpense = new Xpense();
            String XpenseAmountString = intent.getStringExtra("Amount");
            if(XpenseAmountString != null || !XpenseAmountString.equals("")){
                int XpenseAmount = Integer.parseInt(XpenseAmountString);
                xpense.setXpenseAmount(XpenseAmount);
            }
            xpense.setXpenseName(XpenseName);
            Xpenses.add(xpense);
            adapter.notifyDataSetChanged();
        }
    }

//    @Override
//    public void onItemClick(ArrayAdapter<?> adapterView, View view, int i, long l){
//        Xpense xpense = Xpenses.get(i);
//        String XpenseNameClicked = xpense.getXpenseName();
//        int XpenseAmountClicked = xpense.getXpenseAmount();
//        Toast.makeText(this, XpenseNameClicked+" "+XpenseAmountClicked, Toast.LENGTH_SHORT).show();
//    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
