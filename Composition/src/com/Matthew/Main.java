package com.Matthew;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("200","Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, motherboard);
        thePC.powerUp();
        //        thePC.getMonitors().drawPixelAt(1500, 1200, "Red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();

        Bed theBed = new Bed("Grey", 7);
        Desk theDesk = new Desk(4);
        TommyWiseau theMeme = new TommyWiseau("Lisa!");

        Room theRoom = new Room(theBed, theDesk, theMeme);
        theRoom.lisa();
        theRoom.getTheBed().getPillows();
    }
}
