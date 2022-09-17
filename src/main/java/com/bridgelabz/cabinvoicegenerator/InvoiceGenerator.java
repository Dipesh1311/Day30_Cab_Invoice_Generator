package com.bridgelabz.cabinvoicegenerator;

public class InvoiceGenerator {
    private static final double MIN_COST_PER_KM = 10.0;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5;

    public double calaculateFare(double distance, int time) {
        double totalFare = distance * MIN_COST_PER_KM + (double)(time * COST_PER_TIME);
        if (totalFare < MINIMUM_FARE)
            return MINIMUM_FARE;
        return totalFare;
    }
}
