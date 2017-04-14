package com.Matthew;

/**
 * Created by Matthew on 4/14/2017.
 */
public class Printer {
    private int level;
    private int pagesPrinted;
    private Boolean duplex = true;

    public Printer(int level, int pagesPrinted, Boolean duplex) {
        if (level > 0 && level <= 100){
            this.level = level;
        } else {
            this.level = -1;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int fillToner(int toner){
        if (toner > 0 && toner <= 100){
            if (this.level + toner > 100){
                return -1;
            }
            this.level += toner;
            return this.level;
        } else {
            return -1;
        }
    }

    public void pageCount(int pagePrint){
        this.pagesPrinted = this.pagesPrinted + pagePrint;
        System.out.println("Page count is " + this.pagesPrinted + ". Please save more paper!");
    }

    public int getLevel() {
        return level;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public Boolean getDuplex() {
        return duplex;
    }
}
