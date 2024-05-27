package com.example.myapplication;

public class ApiResponse {
    private UsedCarCardData[] stockResults;
    private String nextPageUrl;

    public ApiResponse(UsedCarCardData[] stockResults,String nextPageUrl){
        this.stockResults = stockResults;
        this.nextPageUrl = nextPageUrl;
    }

    public UsedCarCardData[] getStockResults() {
        return stockResults;
    }

    public String getNextPageUrl() {
        return nextPageUrl;
    }
}
