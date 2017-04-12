package com.Matthew;

/**
 * Created by Matthew on 4/12/2017.
 */
public class PC {
    private Case theCase;
    private Monitor monitors;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitors, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitors = monitors;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitors.drawPixelAt(1200, 50, "Green");
    }


//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitors() {
//        return monitors;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
