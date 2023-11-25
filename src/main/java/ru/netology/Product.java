package ru.netology;

class Product {
    private String name;
    private String description;
    private double price;
    private String manufacturer;
    private double rating;

    public Product(String name, String description, double price, String manufacturer, double rating){
        this.name = name;
        this.description = description;
        this.price = price;
        this.manufacturer = manufacturer;
        this.rating = rating;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    public double getRating() {
        return rating;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getManufacturer() {
        return manufacturer;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}