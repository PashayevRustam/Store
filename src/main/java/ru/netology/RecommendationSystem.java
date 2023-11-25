package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class RecommendationSystem {
    public List<String> getRecommendedProducts(User user) {
        List<String> recommendedProducts = new ArrayList<>();

        // Пример: Если пользователь совершил определенное количество покупок,
        // рекомендуем ему некоторые товары
        if (user.getPurchaseHistory().size() >= 1) {
            for (String product : user.getPurchaseHistory()) {
                recommendedProducts.add(product);
            }
        }

        return recommendedProducts;
    }
}
