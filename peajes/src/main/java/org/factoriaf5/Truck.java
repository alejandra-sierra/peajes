package org.factoriaf5;

public class Truck extends Transport {

    private final int axes;
    public Truck(String name, String city, String plate, int axes) {
        super(name, city, plate);
        this.axes = axes;
    }

@Override

    public double calculateFee(){
        return 50*axes;
    }
}