package com.example.caatulgupta.xpenses;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class XpensesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    TextView typeTextView;
    TextView amountTextView;

    public XpensesViewHolder(@NonNull View itemView) {
        super(itemView);

        typeTextView = itemView.findViewById(R.id.typeTextView);
        amountTextView = itemView.findViewById(R.id.amountTextView);

    }

    @Override
    public void onClick(View view) {

    }
}
