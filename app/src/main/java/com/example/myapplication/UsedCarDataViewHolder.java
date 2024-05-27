package com.example.myapplication;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class UsedCarDataViewHolder extends RecyclerView.ViewHolder {
    TextView makeModelText;
    TextView carInfoText;
    TextView priceText;
    TextView makeOfferText;
    TextView emiText;
    TextView emiValue;
    Button chatBtn;
    Button sellerDetailsCTA;

    ImageView carImage;

    public UsedCarDataViewHolder(View view) {
        super(view);

        // Define click listener for the ViewHolder's View

        makeModelText = (TextView) view.findViewById(R.id.makeModelText);
        carInfoText = (TextView) view.findViewById(R.id.carInfoText);
        priceText = (TextView) view.findViewById(R.id.priceText);
        makeOfferText = (TextView) view.findViewById(R.id.makeOfferText);
        emiText = (TextView) view.findViewById(R.id.emiText);
        emiValue = (TextView) view.findViewById(R.id.emiValue);

        chatBtn = (Button) view.findViewById(R.id.chatBtn);
        sellerDetailsCTA = (Button) view.findViewById(R.id.sellerDetailCTA);

        carImage = (ImageView) view.findViewById(R.id.imageView);
    }
}