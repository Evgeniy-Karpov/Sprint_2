package model;

import model.constants.Discount;
import model.constants.Colour;

public class Apple extends Food{
    private String colour;
    public Apple (int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (Colour.RED.equals(this.colour)) { // изменился метод на equals() для проверки совпадения String
            return Discount.DISCOUNT;      // 60
        }
        return Discount.NO_DISCOUNT;       // 0
    }
}
