package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public abstract class InfiniteRecycleViewScrollListener extends RecyclerView.OnScrollListener {
    private LinearLayoutManager layoutManager;

    private int previousTotalItemCount = 0;
    private boolean loading=true;
    private int visibleItems = 5;
    private int currentPage = 0;

    public InfiniteRecycleViewScrollListener(LinearLayoutManager layoutManager){
        this.layoutManager =  layoutManager;
    }

    @Override
    public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
//        super.onScrolled(recyclerView, dx, dy);
        int lastVisibleItemPosition = layoutManager.findLastVisibleItemPosition();
        int totalItemCount = layoutManager.getItemCount();

        if(totalItemCount < previousTotalItemCount){
            currentPage = 0;
            previousTotalItemCount = totalItemCount;

            if(totalItemCount == 0){
                loading = true;
            }
        }

        if(loading && (totalItemCount > previousTotalItemCount)){
            loading =false;
            previousTotalItemCount = totalItemCount;
        }

        if(!loading && (lastVisibleItemPosition + visibleItems) > totalItemCount){
            currentPage++;
            onLoadMore(currentPage,totalItemCount,recyclerView);
            loading = true;
        }
    }

    public abstract void onLoadMore(int page,int totalItemsCount,RecyclerView view);
}
