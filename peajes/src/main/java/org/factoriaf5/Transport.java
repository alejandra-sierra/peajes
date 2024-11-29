package org.factoriaf5;

public abstract  class Transport {
    
    private final String name;
    private final String city;
    private final String plate;

    

    public Transport(String name, String city, String plate) {
        this.name = name;
        this.city = city;
        this.plate = plate;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getPlate() {
        return plate;
    }

    public abstract double calculateFee();

}






