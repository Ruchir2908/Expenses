package com.example.caatulgupta.xpenses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddXpenseActivity extends AppCompatActivity {

    EditText nameEditText, amountEditText;
    Button addXpenseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_xpense);

        nameEditText = findViewById(R.id.nameEditText);
        amountEditText = findViewById(R.id.amountEditText);
        addXpenseButton = findViewById(R.id.addXpenseButton);

        addXpenseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addXpense(view);
            }
        });

//        Toast.makeText(this, "alsooo", Toast.LENGTH_SHORT).show();
    }

    public void addXpense(View view){
        Intent intent = getIntent();
//        if(nameEditText.getText().toString()==null){
//            intent.putExtra("Name","Click to add title");
//        }else {
            intent.putExtra("Name", nameEditText.getText().toString());
//        }
//        if(amountEditText.getText().toString()==null){
//            intent.putExtra("Amount","Click to add amount");
//        }else {
            if(amountEditText.getText() == null){
                intent.putExtra("Amount","0");
            }else {
                intent.putExtra("Amount", amountEditText.getText().toString());
            }
//        }
        setResult(2,intent);
        finish();
    }
}
