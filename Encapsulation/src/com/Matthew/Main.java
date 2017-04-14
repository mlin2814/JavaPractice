package com.Matthew;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Matthew";
//        player.health = 50;
//        player.weapon = "ACR";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());
//
//        damage = 40;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());

//        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Matt", 100, "ACR");
//        System.out.println("Initial health is " + enhancedPlayer.getHealth());

        Printer printer = new Printer(15, 50, true);

        int toner = 12;
        printer.fillToner(toner);

        int pagePrint = 20;
        printer.pageCount(pagePrint);
        System.out.println("Current page count is " + printer.getPagesPrinted());

    }
}
