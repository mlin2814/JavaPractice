package com.Matthew;

public class Main {

    public static void main(String[] args) {
        Bank account = new Bank();

        account.setName("John");
        account.setEmail("dummy@dummyMail.com");
        account.setPhone("7891234567");
        System.out.println("Here is the account information we have on record: Name - "
                + account.getName() + ". Email - " + account.getEmail() +
                ". Phone Number - " + account.getPhone()
        );
        account.setAccount(123);
        System.out.println("Your account number is " + account.getAccount());
        account.setBalance(10);
        System.out.println("Your current balance is $" + account.getBalance());

        account.deposit(100);
        System.out.println("Your current balance is $" + account.getBalance());

//        account.deposit(12);
//        System.out.println(account.deposit(12));
//        account.withdrawal(18);


    }
}
