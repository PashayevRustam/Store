package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class DeliveryService {
    private Map<String, Order> ordersInTransit;

    public DeliveryService() {
        this.ordersInTransit = new HashMap<>();
    }

    public String shipOrder(Order order) {
        String trackingNumber = generateTrackingNumber();

        order.setOrderStatus(OrderStatus.IN_TRANSIT);

        ordersInTransit.put(trackingNumber, order);

        return trackingNumber;
    }

    public void trackOrder(String trackingNumber) {
        if (ordersInTransit.containsKey(trackingNumber)) {
            Order order = ordersInTransit.get(trackingNumber);
            System.out.println("Order " + order.getOrderNumber() + " is in transit");
        } else {
            System.out.println("No order found with tracking number " + trackingNumber);
        }
    }
    private String generateTrackingNumber() {
        return String.valueOf(System.currentTimeMillis());
    }
}
