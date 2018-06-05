package com.Matthew;

/**
 * Created by Matthew on 6/26/2017.
 */
public class Healthy extends Hamburger{

    private String addition5Name;
    private double addition5Price;

    private String addition6Name;
    private double addition6Price;

    public Healthy(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealth1(String name, double price){
        this.addition5Name = name;
        this.addition5Price = price;
    }

    public void addHealth2(String name, double price){
        this.addition6Name = name;
        this.addition6Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.addition5Name != null){
            hamburgerPrice += this.addition5Price;
            System.out.println("Added " + this.addition5Name + " for an extra " + this.addition5Price);
        }

        if(this.addition6Name != null){
            hamburgerPrice += this.addition6Price;
            System.out.println("Added " + this.addition6Name + " for an extra " + this.addition6Price);
        }

        return hamburgerPrice;
    }

    //    public Healthy(String bread, String meat, String name, int price, String addition5, double aprice5, String addition6, double aprice6) {
//        super(bread, meat, name, price);
//        this.addition5 = addition5;
//        this.aprice5 = aprice5;
//        this.addition6 = addition6;
//        this.aprice6 = aprice6;
//    }
//
//    public void addition5(String name, double price){
//        this.addition5 = name;
//        this.aprice5 = price;
//    }
//
//    public void addition6(String name, double price){
//        this.addition6 = name;
//        this.aprice6 = price;
//    }
//
//    public double toppings() {
//        double healthyBurgerPrice = this.price;
//        System.out.println(this.name + " burger is $" + this.price);
//
//        if (this.addition5 != null) {
//            healthyBurgerPrice += aprice5;
//            System.out.println("Added $" + aprice5 + " to your order for " + addition5);
//        }
//
//        if (this.addition6 != null) {
//            healthyBurgerPrice += aprice6;
//            System.out.println("Added $" + aprice6 + " to your order for " + addition6);
//        }
//        return healthyBurgerPrice;
//    }
}
