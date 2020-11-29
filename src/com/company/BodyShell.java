package com.company;

import java.util.ArrayList;

public class BodyShell {
    //Sport, SUV, Classic, ATV, Dune Buggy, Crawlers + (Military, Trucks)
    private String type;
    private boolean isPurchasable;

    private ArrayList<String> bodyShellType = new ArrayList<>();

    private static int numberOfSport;
    private static int numberOfClassic;
    private static int numberOfSUV;
    private static int numberOfDuneBuggy;
    private static int numberOfCrawlers;
    private static int numberOfATV;
    private static int numberOfMilitary;
    private static int numberOfTrucks;
    private static int numberOfTotalShell;

    public BodyShell(String type, boolean isPurchasable) {
        this.type = type;
        this.isPurchasable = isPurchasable;
        initializeArray();
        validShellType(this.type);
        incrementBodyShell(this.type);
        numberOfTotalShell++;
    }

    public boolean validShellType(String typeOfShell){
        for( String type :bodyShellType){
            if (typeOfShell.equalsIgnoreCase(type)){
                return true;
            }
        }
        return false;
    }

    public void initializeArray(){
        bodyShellType.add("SUV");
        bodyShellType.add("SPORT");
        bodyShellType.add("CLASSIC");
        bodyShellType.add("ATV");
        bodyShellType.add("DUNE BUGGY");
        bodyShellType.add("CRAWLERS");
        bodyShellType.add("MILITARY");
        bodyShellType.add("TRUCKS");
    }

    public void incrementBodyShell(String typeOfShell){
        if(validShellType(typeOfShell)){
            int index = bodyShellType.indexOf(typeOfShell);

            switch (index){
                case 0:
                    numberOfSUV++;
                    break;
                case 1:
                    numberOfSport++;
                    break;
                case 2:
                    numberOfClassic++;
                    break;
                case 3:
                    numberOfATV++;
                    break;
                case 4:
                    numberOfDuneBuggy++;
                    break;
                case 5:
                    numberOfCrawlers++;
                    break;
                case 6:
                    numberOfMilitary++;
                    break;
                case 7:
                    numberOfTrucks++;
                    break;

            }
        }
    }

    public String getType() {
        return type;
    }

    public boolean isPurchasable() {
        return isPurchasable;
    }

    public ArrayList<String> getBodyShellType() {
        return bodyShellType;
    }

    public static int getNumberOfSport() {
        return numberOfSport;
    }

    public static int getNumberOfClassic() {
        return numberOfClassic;
    }

    public static int getNumberOfSUV() {
        return numberOfSUV;
    }

    public static int getNumberOfDuneBuggy() {
        return numberOfDuneBuggy;
    }

    public static int getNumberOfCrawlers() {
        return numberOfCrawlers;
    }

    public static int getNumberOfATV() {
        return numberOfATV;
    }

    public static int getNumberOfMilitary() {
        return numberOfMilitary;
    }

    public static int getNumberOfTrucks() {
        return numberOfTrucks;
    }

    public static int getNumberOfTotalShell() {
        return numberOfTotalShell;
    }
}
