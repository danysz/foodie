package com.foodis.app.data_models;

public class Seller {

    private String name;
    private String city;
    private String address;
    private int addresNumber;

    public Seller(){}

    public Seller(String name, String city, String address, int addresNumber) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.addresNumber = addresNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAddresNumber() {
        return addresNumber;
    }

    public void setAddresNumber(int addresNumber) {
        this.addresNumber = addresNumber;
    }
}
