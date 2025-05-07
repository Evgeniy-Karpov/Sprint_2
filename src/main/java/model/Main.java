package model;

import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5,100);
        Food redApples = new Apple(10,50, Colour.RED);
        Food greenApples = new Apple(8,60, Colour.GREEN);

        Food[] products = {meat,redApples,greenApples};

        ShoppingCart cart = new ShoppingCart(products);

        System.out.printf("Общая сумма товаров без скидки: %.2f руб.%n", cart.getTotalPrice()); // изменено на System.out.printf
        System.out.printf("Общая сумма товаров со скидкой: %.2f руб.%n", cart.getTotalPriceWithDiscount());
        System.out.printf("Сумма вегетарианских продуктов: %.2f руб.%n", cart.getVegetarianPrice());

    }
}
