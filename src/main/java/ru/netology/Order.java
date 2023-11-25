package ru.netology;

import ru.netology.Product;

import java.util.List;

class Order {
    private List<Product> products;
    private String trackingNumber;
    private boolean isReturned;
    private String orderNumber;
    private OrderStatus orderStatus;

//    public Order(List<Product> products, String trackingNumber, boolean isReturned){
//        this.isReturned = isReturned;
//        this.products = products;
//        this.trackingNumber = trackingNumber;
//    }

    public Order(String orderNumber) {
        this.orderNumber = orderNumber;
        this.orderStatus = OrderStatus.PROCESSING; // Начальный статус - в обработке
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public List<Product> getProducts() {
        return products;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }
    public boolean isReturned() {
        return isReturned;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
    public String getOrderNumber() {
        return orderNumber;
    }
}