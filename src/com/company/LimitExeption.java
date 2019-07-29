package com.company;

public class LimitExeption extends Exception {

    private String message;
    private double remainingAmount;

    public double getRemainingAmount() {
        return remainingAmount;
    }

    LimitExeption (String message, double remainingAmount){

    }



}
