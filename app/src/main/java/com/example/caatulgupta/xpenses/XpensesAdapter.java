package com.example.caatulgupta.xpenses;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
    public void onBindViewHolder(@NonNull XpensesViewHolder xpensesViewHolder, int i) {
        Xpense xpense = Xpenses.get(i);
        xpensesViewHolder.typeTextView.setText(xpense.getXpenseName());
        xpensesViewHolder.amountTextView.setText(xpense.getXpenseAmount()+"");
    }

    @Override
    public int getItemCount() {
        return Xpenses.size();
    }
}
