package com.example.demosqlite02;

public class ModelRecord {

    String id, product_name, image, brand, model, serialnumber, price;


    public ModelRecord() {

    }

    public ModelRecord(String id, String product_name, String image, String brand, String model, String serialnumber, String price) {
        this.id = id;
        this.product_name = product_name;
        this.image = image;
        this.brand = brand;
        this.model = model;
        this.serialnumber = serialnumber;
        this.price = price;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

   }
