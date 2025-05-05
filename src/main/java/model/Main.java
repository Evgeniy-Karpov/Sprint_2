package model;

import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5,100);
        Food redApples = new Apple(10,50, Colour.red);
        Food greenApples = new Apple(8,60, Colour.green);

        Food[] products = {meat,redApples,greenApples};

        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Общая сумма товаров без скидки " + cart.getTotalPrice() + " руб.");
        System.out.println("Общая сумма товаров с скидкой " + cart.getTotalPriceWithDiscount() + " руб.");
        System.out.println("Cуммa всех вегетарианских продуктов без скидки " + cart.getVegetarianPrice() + " руб.");

    }
}
