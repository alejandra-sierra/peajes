package org.factoriaf5;

public class Motorbike extends Transport {
    public Motorbike(String name, String city, String plate){
        super(name, city, plate);
    }

    @Override
    public double calculateFee() {
        return 50;
    }
}

