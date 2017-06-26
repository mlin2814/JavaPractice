package com.Matthew;

/**
 * Created by Matthew on 6/26/2017.
 */
public class Regular {
    private String bread;
    private String meat;
    public String name;
    public double price;

    private String addition1;
    private double aprice1;

    private String addition2;
    private double aprice2;

    private String addition3;
    private double aprice3;

    private String addition4;
    private double aprice4;

    public Regular(String bread, String meat, String name, int price) {
        this.bread = bread;
        this.meat = meat;
        this.name = name;
        this.price = price;
    }

    public void addition1(String name, double price){
        this.addition1 = name;
        this.aprice1 = price;
    }

    public void addition2(String name, double price){
        this.addition2 = name;
        this.aprice2 = price;
    }

    public void addition3(String name, double price){
        this.addition3 = name;
        this.aprice3 = price;
    }

    public void addition4(String name, double price){
        this.addition4 = name;
        this.aprice4 = price;
    }

    public double toppings(){
        double burgerPrice = this.price;
        System.out.println(this.name + " burger is $" + this.price);

        if (this.addition1 != null){
            burgerPrice += aprice1;
            System.out.println("Added $" + aprice1 + " to your order for " + addition1);
        }
        if (this.addition2 != null){
            burgerPrice += aprice2;
            System.out.println("Added $" + aprice2 + " to your order for " + addition2);
        }
        if (this.addition3 != null){
            burgerPrice += aprice1;
            System.out.println("Added $" + aprice3 + " to your order for " + addition3);
        }
        if (this.addition4 != null){
            burgerPrice += aprice4;
            System.out.println("Added $" + aprice4 + " to your order for " + addition4);
        }

        return burgerPrice;
    }
}
