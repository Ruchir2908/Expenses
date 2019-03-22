package com.example.caatulgupta.xpenses;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

class XpensesAdapter extends RecyclerView.Adapter<XpensesViewHolder>{

    ArrayList<Xpense> Xpenses;
    Context context;

    XpensesAdapter(Context context, ArrayList<Xpense> Xpenses){
        this.context = context;
        this.Xpenses = Xpenses;
    }

    @NonNull
    @Override
    public XpensesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowLayout = layoutInflater.inflate(R.layout.xpense_row_layout,viewGroup,false);
        return new XpensesViewHolder(rowLayout);
    }

    @Override
    public void onBindViewHolder(@NonNull XpensesViewHolder xpensesViewHolder,final int i) {
        Xpense xpense = Xpenses.get(i);
        xpensesViewHolder.nameTextView.setText(xpense.getXpenseName());
        xpensesViewHolder.amountTextView.setText(xpense.getXpenseAmount()+"");
        xpensesViewHolder.balanceTextView.setText("Rs. 0.0");
        xpensesViewHolder.timeTextView.setText("00:00");

        xpensesViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Xpense xpense = Xpenses.get(i);
                String XpenseNameClicked = xpense.getXpenseName();
                int XpenseAmountClicked = xpense.getXpenseAmount();
                Intent intent = new Intent(context,DetailsActivity.class);
                intent.putExtra("Xpense",xpense);
                context.startActivity(intent);
            }
        });
    }



    @Override
    public int getItemCount() {
        return Xpenses.size();
    }
}
