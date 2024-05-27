package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private UsedCarAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<UsedCarCardData> list = getData(1);
        ClickListener listener = new ClickListener() {
            @Override
            public void click(int index) {
                Log.d("CARD CLICK","with index "+index);
                Toast.makeText(getApplicationContext(),"clicked item with index "+index,Toast.LENGTH_LONG).show();
            }
        };
        customAdapter = new UsedCarAdapter(list,getApplication(),listener);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setAdapter(customAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        customAdapter.notifyDataSetChanged();
        recyclerView.addOnScrollListener(new InfiniteRecycleViewScrollListener(layoutManager) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                page = page +1;
                Log.e("TAG", "onLoadMore: inside page no: "+page );
                getData(page);
            }
        });
    }

    private List<UsedCarCardData> getData(int page){
        List<UsedCarCardData> list = new ArrayList<>();

        ApiInterface apiInterface= RetrofitClient.getRetrofitInstance().create(ApiInterface.class);
        Call<ApiResponse> call = apiInterface.getCarData(page,page*12);

        call.enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                for (int i = 0; i < response.body().getStockResults().length; i++) {
                    list.add(response.body().getStockResults()[i]);
                    customAdapter.notifyDataSetChanged();
                }
                Log.e("TAG", "onResponse: pageNo: "+page+" list:"+list.size()+" "+response.body().getStockResults().length );
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                Log.e("TAG", "onFailure: "+t.getMessage() );
            }
        });

        return list;
    }

    public void onRegisterClick(View view){
        Log.d("LOG","This is button press");
    }
}