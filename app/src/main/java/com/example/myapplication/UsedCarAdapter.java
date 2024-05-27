package com.example.myapplication;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

public class UsedCarAdapter extends RecyclerView.Adapter<UsedCarDataViewHolder> {

    List<UsedCarCardData> list = Collections.emptyList();
    Context context;
    ClickListener listener;

    public UsedCarAdapter(List<UsedCarCardData> list,Context context,ClickListener listener){
        this.list = list;
        this.context = context;
        this.listener = listener;
    }

    @Override
    public UsedCarDataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View cardView = inflater.inflate(R.layout.usedcarcard,parent,false);

        UsedCarDataViewHolder viewHolder = new UsedCarDataViewHolder(cardView);

        return viewHolder;
    }

    String api = "www.carwale.com/webapi/classified/stock/?&so=-1&sc=-1&city=26&";

    @Override
    public void onBindViewHolder(final UsedCarDataViewHolder holder,final int position) {
        final int index =  holder.getAdapterPosition();
        UsedCarCardData carData = list.get(position);
        holder.makeModelText.setText(carData.getCarName());
        holder.carInfoText.setText(carData.getKms()+"km | "+carData.getFuel());
        holder.priceText.setText(carData.getFormattedPrice());
        holder.emiText.setText("EMI starts at ");
        holder.emiValue.setText(carData.getEmiText());
        Uri uri = Uri.parse(carData.getOriginalImgPath());
//        holder.carImage.setImageURI(uri);
        holder.itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                listener.click(index);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }
}
