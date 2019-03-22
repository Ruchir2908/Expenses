package com.example.caatulgupta.xpenses;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

class XpensesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    TextView nameTextView, amountTextView, timeTextView, balanceTextView;
    ImageView imageView;

    public XpensesViewHolder(@NonNull View itemView) {
        super(itemView);

        nameTextView = itemView.findViewById(R.id.nameTextView);
        amountTextView = itemView.findViewById(R.id.amountTextView);
        timeTextView = itemView.findViewById(R.id.timeTextView);
        balanceTextView = itemView.findViewById(R.id.balanceTextView);
        imageView = itemView.findViewById(R.id.imageView);

    }

    @Override
    public void onClick(View view) {

    }
}
