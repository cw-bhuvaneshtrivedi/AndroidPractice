package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
        private String[] localDataSet;

        public  static class ViewHolder extends RecyclerView.ViewHolder {
            private final TextView textView;

            public ViewHolder(View view) {
                super(view);

                // Define click listener for the ViewHolder's View

                textView = (TextView) view.findViewById(R.id.txtView);
            }

            public TextView getTextView(){
                return textView;
            }
        }

        public CustomAdapter(String[] dataSet) {
            localDataSet =dataSet;
        }


        public ViewHolder onCreateViewHolder(ViewHolder viewHolder,final int position){
            viewHolder.getTextView().setText(localDataSet[position]);
        }

        public int getItemCount(){
            return localDataSet.length;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setAdapter(customAdapter);
    }

    public void onRegisterClick(View view){
        Log.d("LOG","This is button press");
    }
}