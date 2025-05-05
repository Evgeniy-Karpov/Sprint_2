package model;

import model.constants.Discount;

public abstract class Food implements Discountable {
    protected int amount; // — количество продукта в килограммах (целое число)
    protected double price; // — цена за единицу (вещественное число)
    protected boolean isVegetarian; // — флаг, который показывает, вегетарианский ли продукт.


    public int getAmount() {
        return this.amount;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isVegetarian() {
        return this.isVegetarian;
    }

    @Override
    public double getDiscount(){
        return Discount.No_Discount;
    }

}



