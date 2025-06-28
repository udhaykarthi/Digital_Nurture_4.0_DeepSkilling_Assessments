package com.example;

public class Service { 
    private Api api; 

    public Service(Api api) { 
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}
