package com.Matthew;

/**
 * Created by Matthew on 3/30/2017.
 */
public class Bank {
    private int account;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public void setAccount(int account){
        this.account = account;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public int getAccount(){
        return this.account;
    };

    public double getBalance(){
        return this.balance;
    };

    public String getPhone(){
        return this.phone;
    };

    public String getName(){
        return this.name;
    };

    public String getEmail(){
        return this.email;
    };

    public void deposit (double depositAmount){
        this.balance += depositAmount;
    }

    public void withdrawal (double withdrawalAmount){
        if ((this.balance - withdrawalAmount) <= 0){
            System.out.println("Insufficient funds!");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("You have withdrawn $" + withdrawalAmount + ". You have $" + this.balance + " in your account");
        }
    }
}


