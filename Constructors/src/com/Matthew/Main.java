package com.Matthew;

public class Main {

    public static void main(String[] args) {
//        Bank account = new Bank();
//                (123, 0.00, "John", "dummy@dummyMail.com", "7891234567");

//        account.setName("John");
//        account.setEmail("dummy@dummyMail.com");
//        account.setPhone("7891234567");
//        System.out.println("Here is the account information we have on record: Name - "
//                + account.getName() + ". Email - " + account.getEmail() +
//                ". Phone Number - " + account.getPhone()
//        );
//        account.setAccount(123);
//        System.out.println("Your account number is " + account.getAccount());
//        account.setBalance(10);
//        System.out.println("Your current balance is $" + account.getBalance());
//        System.out.println(account.getName());
//
//        account.deposit(100);
//        System.out.println("Your current balance is $" + account.getBalance());
//
//        account.withdrawal(20);
//        account.deposit(12);
//        System.out.println(account.deposit(12));
//        account.withdrawal(18);

        VIP account = new VIP();

        System.out.println(account.getName());
        System.out.println(account.getLimit());
        System.out.println(account.getEmail());

        VIP altAccount = new VIP("Tammy", 200.00);
        System.out.println(altAccount.getName());
        System.out.println(altAccount.getLimit());
        System.out.println(altAccount.getEmail());
    }
}
