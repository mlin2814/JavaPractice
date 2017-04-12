package com.Matthew;

/**
 * Created by Matthew on 4/12/2017.
 */
public class Bed {
    private String sheetColor;
    private int pillows;

    public Bed(String sheetColor, int pillows) {
        this.sheetColor = sheetColor;
        this.pillows = pillows;
    }

    public String getSheetColor() {
        return sheetColor;
    }

    public int getPillows() {
        return pillows;
    }
}
