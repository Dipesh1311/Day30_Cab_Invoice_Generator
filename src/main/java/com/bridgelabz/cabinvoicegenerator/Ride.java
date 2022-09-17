package com.bridgelabz.cabinvoicegenerator;
import com.bridgelabz.cabinvoicegenerator.InvoiceGenerator.RideMode;
public class Ride {

    public double distance;
    public int time;

    public Ride(double distance, int time) {
        this.distance = distance;
        this.time = time;
    }

    public Ride(double distance, int time, RideMode rideMode) {
        this.distance = distance;
        this.time = time;
    }

}
