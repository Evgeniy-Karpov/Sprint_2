package service;

import model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart (Food[] foods) {
        this.foods = foods;
    }
    public double getTotalPrice() { //  общая сумма товаров в корзине без скидки
        double sum = 0;
        for (int i = 0; i < foods.length; i++) {
            sum += foods[i].getAmount() * foods[i].getPrice();
        }
        return sum;
    }

    public double getTotalPriceWithDiscount() { // общая сумма товаров со скидкой,
        double sum = 0;
        for (int i = 0; i < foods.length; i++) {
            double price = foods[i].getAmount() * foods[i].getPrice();
            double discount = foods[i].getDiscount();
            sum += price * (1 - discount / 100);
        }
        return sum;
    }

    public double getVegetarianPrice() {
        double sum = 0;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].isVegetarian()) {
                sum += foods[i].getAmount() * foods[i].getPrice();
            }
        }
        return sum;
    }
}
