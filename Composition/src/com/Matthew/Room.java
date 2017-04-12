package com.Matthew;

/**
 * Created by Matthew on 4/12/2017.
 */
public class Room {

    private Bed theBed;
    private Desk theDesk;
    private TommyWiseau theTom;

    public Room(Bed theBed, Desk theDesk, TommyWiseau theTom) {
        this.theBed = theBed;
        this.theDesk = theDesk;
        this.theTom = theTom;
    }

    public void lisa(){
        theTom.theQuote();
    }

    public Bed getTheBed() {
        return theBed;
    }

    public Desk getTheDesk() {
        return theDesk;
    }

    public TommyWiseau getTheTom() {
        return theTom;
    }
}
