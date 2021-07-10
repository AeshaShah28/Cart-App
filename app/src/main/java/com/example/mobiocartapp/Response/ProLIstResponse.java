package com.example.mobiocartapp.Response;

import java.util.List;

public class ProLIstResponse
{
    /**
     * _id : 60c30c3d54a6468980addbff
     * price : $1,233.81
     * picture : http://placehold.it/256x256
     * colors : ["Red","Blue"]
     * productName : COMTEST
     * brands : [{"id":0,"name":"Schroeder Valenzuela"},{"id":1,"name":"Gamble Hendrix"},{"id":2,"name":"Pat Gray"}]
     */

    private String _id;
    private String price;

    public ProLIstResponse(String _id, String price, String picture, String productName) {
        this._id = _id;
        this.price = price;
        this.picture = picture;
        this.productName = productName;
    }

    private String picture;
    private String productName;


   /* private List<String> colors;
    private List<BrandsBean> brands*/;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

   /* public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public List<BrandsBean> getBrands() {
        return brands;
    }

    public void setBrands(List<BrandsBean> brands) {
        this.brands = brands;
    }

    public static class BrandsBean {
        *//**
         * id : 0
         * name : Schroeder Valenzuela
         *//*

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }*/
}
