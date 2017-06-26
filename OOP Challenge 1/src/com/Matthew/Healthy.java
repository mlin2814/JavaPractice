package com.Matthew;

/**
 * Created by Matthew on 6/26/2017.
 */
public class Healthy extends Regular{

    private String addition5;
    private double aprice5;

    private String addition6;
    private double aprice6;

    public Healthy(String bread, String meat, String name, int price, String addition5, double aprice5, String addition6, double aprice6) {
        super(bread, meat, name, price);
        this.addition5 = addition5;
        this.aprice5 = aprice5;
        this.addition6 = addition6;
        this.aprice6 = aprice6;
    }

    public void addition5(String name, double price){
        this.addition5 = name;
        this.aprice5 = price;
    }

    public void addition6(String name, double price){
        this.addition6 = name;
        this.aprice6 = price;
    }

    public double toppings() {
        double healthyBurgerPrice = this.price;
        System.out.println(this.name + " burger is $" + this.price);

        if (this.addition5 != null) {
            healthyBurgerPrice += aprice5;
            System.out.println("Added $" + aprice5 + " to your order for " + addition5);
        }

        if (this.addition6 != null) {
            healthyBurgerPrice += aprice6;
            System.out.println("Added $" + aprice6 + " to your order for " + addition6);
        }
        return healthyBurgerPrice;
    }
}
