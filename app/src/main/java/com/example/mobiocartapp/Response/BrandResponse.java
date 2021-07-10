package com.example.mobiocartapp.Response;

import java.util.ArrayList;
import java.util.List;

public class BrandResponse {

    public String id;
    public String name;


    public BrandResponse() {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<BrandResponse> fillBrand() {
        List<BrandResponse> brandlist = new ArrayList<>();
        BrandResponse response = new BrandResponse();
        response.setName("Name");
        brandlist.add(response);
        return brandlist;
    }

}