package com.example.hw3;

public class Foods {
    private String foodName ;
    private double foodPrice ;
    private int foodImeg ;

    public Foods(String foodName, double foodPrice, int foodImeg) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodImeg = foodImeg;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    public int getFoodImeg() {
        return foodImeg;
    }

    public void setFoodImeg(int foodImeg) {
        this.foodImeg = foodImeg;
    }
}
