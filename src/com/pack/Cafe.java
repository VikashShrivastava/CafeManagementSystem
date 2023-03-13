package com.pack;

public class Cafe {

    private final String cafeName = "MoveInSync Cafe";
    private int noOfChef;
    private final int noOfWaiter = 1;

    Cafe(int noOfChef){
        this.noOfChef = noOfChef;
    }

    public int getNoOfChef() {
        return noOfChef;
    }

    public void setNoOfChef(int noOfChef) {
        this.noOfChef = noOfChef;
    }

    public String getCafeName() {
        return cafeName;
    }

    public int getNoOfWaiter() {
        return noOfWaiter;
    }

    @Override
    public String toString() {
        return "Welocme to " + this.getCafeName() + " :)" + "\n" + "We have " + this.getNoOfChef() + " chef's  and 1 waiter in our cafe." + "\n" +
                "HOPE YOU WILL ENJOY.";
    }
}
