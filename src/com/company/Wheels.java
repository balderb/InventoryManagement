package com.company;

public class Wheels {

    private static int totalTires;
    private static int totalWideTires;
    private static int totalStandardTires;

    private boolean isWide;

    public Wheels( boolean isWide) {
        this.isWide = isWide;
        if(isWide){
            totalWideTires++;
        }else {
            totalStandardTires++;
        }
        totalTires++;
    }

    public boolean isWide() {
        return isWide;
    }

    public static int getTotalTires() {
        return totalTires;
    }

    public static int getTotalWideTires() {
        return totalWideTires;
    }

    public static int getTotalStandardTires() {
        return totalStandardTires;
    }
}
