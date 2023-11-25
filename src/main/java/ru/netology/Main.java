package ru.netology;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", "Powerful laptop with high specs", 999.99, "ManufacturerA", 0.0);
        Product phone = new Product("Smartphone", "Latest smartphone model", 599.99, "ManufacturerB", 0.0);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(laptop);
        cart.addProduct(phone);

        Random randomNumber = new Random();
        String orderNumber = Integer.toString(randomNumber.nextInt(9999));
        Order order = new Order(orderNumber);
        order.setProducts(cart.getProducts());

        DeliveryService deliveryService = new DeliveryService();
        String trackingNumber = deliveryService.shipOrder(order);

        deliveryService.trackOrder(trackingNumber);

        RatingSystem ratingSystem = new RatingSystem();
        ratingSystem.rateProduct(laptop, 4.5);

        RecommendationSystem recommendationSystem = new RecommendationSystem();
        User user = new User("JohnDoe", "john.doe@example.com");
        user.addToPurchaseHistory(laptop.getName());
        user.addToPurchaseHistory(phone.getName());

        List<String> userPurchaseHistory = user.getPurchaseHistory();
        System.out.println("Purchase history for user " + user.getUsername() + ": " + userPurchaseHistory);

        List<String> recommendedProducts = recommendationSystem.getRecommendedProducts(user);

        System.out.println("Рекомендованные продукты для пользователя " + user.getUsername() + ":");
        for (String recommendedProduct : recommendedProducts) {
            System.out.println(recommendedProduct);
        }
    }
}