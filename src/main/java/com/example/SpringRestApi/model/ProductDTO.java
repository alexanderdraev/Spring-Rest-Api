package com.example.SpringRestApi.model;

public class ProductDTO {

    private CourierDTO courierDTO;
    private String productName;
    private Double price;
    private String description;

    public ProductDTO() {
    }

    public CourierDTO getCourierDTO() {
        return courierDTO;
    }

    public void setCourierDTO(CourierDTO courierDTO) {
        this.courierDTO = courierDTO;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "courierDTO=" + courierDTO +
                ",productName='" + productName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
