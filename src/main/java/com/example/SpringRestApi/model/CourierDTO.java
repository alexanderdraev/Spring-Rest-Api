package com.example.SpringRestApi.model;


public class CourierDTO {

    private String name;
    private String phoneNumber;
    private String carRegistration;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCarRegistration() {
        return carRegistration;
    }

    public void setCarRegistration(String carRegistration) {
        this.carRegistration = carRegistration;
    }

    @Override
    public String toString() {
        return "CourierDTO{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", carRegistration='" + carRegistration + '\'' +
                '}';
    }
}
