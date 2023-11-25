package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String username;
    private String email;
    private ShoppingCart shoppingCart;
    private List<String> purchaseHistory;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.shoppingCart = new ShoppingCart();
        this.purchaseHistory = new ArrayList<>();
    }

    public List<String> getPurchaseHistory() {
        return new ArrayList<>(purchaseHistory);
    }

    public void addToPurchaseHistory(String product) {
        purchaseHistory.add(product);
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void addToCart(Product product) {
        shoppingCart.addProduct(product);
    }

    public void removeFromCart(Product product) {
        shoppingCart.removeProduct(product);
    }

    public void clearCart() {
        shoppingCart = new ShoppingCart();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email);
    }
}
