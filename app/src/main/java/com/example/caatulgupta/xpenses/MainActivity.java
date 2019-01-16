package com.example.caatulgupta.xpenses;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
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
//    ListView listView;
    RecyclerView recyclerView;
    XpensesAdapter adapter;
    ArrayList<Xpense> Xpenses = new ArrayList<>();
//    int testAmt = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, testAmt+"", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,AddXpenseActivity.class);
                startActivityForResult(intent,1);
//                startActivity(intent);
//                Xpense test = new Xpense("try",++testAmt);
//                test.setXpenseName("try"+testAmt);
//                test.setXpenseAmount(++testAmt);
//                Log.i("Kya",test.getXpenseName());
//                Log.i("Kya",test.getXpenseAmount()+"");

//                Xpenses.add(test);
//                adapter.notifyDataSetChanged();
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
//                builder.setView(R.layout.activity_addXpense);
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
//            Toast.makeText(this, "herere", Toast.LENGTH_SHORT).show();
            String XpenseName = intent.getStringExtra("Name");
            int XpenseAmount = Integer.parseInt(intent.getStringExtra("Amount"));
            Xpense xpense = new Xpense();
            xpense.setXpenseName(XpenseName);
            xpense.setXpenseAmount(XpenseAmount);
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
