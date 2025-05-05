package model;

import model.constants.Discount;
import model.constants.Colour;

public class Apple extends Food{
    private String colour;
    public Apple (int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = true;
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (this.colour == Colour.red) {
            return Discount.Discount;      // 60
        }
        return Discount.No_Discount;       // 0
    }
}
