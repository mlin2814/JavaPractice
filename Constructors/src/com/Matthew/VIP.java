package com.Matthew;

/**
 * Created by Matthew on 3/31/2017.
 */

public class VIP {
    private String name;
    private double limit;
    private String email;


    public VIP(String name, double limit, String email){
        System.out.println("Second constructor");
        this.name = name;
        this.email = email;
        this.limit = limit;
    }

    public VIP(String name, double limit) {
        this(name, limit, "unknown@mail.com");

    }

    public VIP() {
        this("Name", 10.00, "steve@mail.com");
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}
