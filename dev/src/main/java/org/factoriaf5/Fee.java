package org.factoriaf5;

import java.util.ArrayList;
import java.util.List;

public class Fee {
    private final String name;
    private final String city;
    private double money;
    private final List<Transport> transports;

    public Fee(String name, String city, double money, List<Transport> transports) {
        this.name = name;
        this.city = city;
        this.money = 0;
        this.transports = new ArrayList<>();
    }

    public void addTransport(Transport transport) {
        double fee= transport.calculateFee();
        this.money += fee;
        transports.add(transport);
        System.out.println("vehiculo con matricula: " + transport.getPlate() + "Peaje: " + fee);
    }

    public void report () {
        System.out.println("Reporte de peajes para " + name + " en " + city + ":");
        System.out.println("Total de peajes: " + money);
        System.out.println("vehiculos:");
        for (Transport transport : transports) {
            System.out.println("matricula " + transport.getPlate() + " Peaje: " + transport.calculateFee() + "€");
        }
    }

    public double getMoney() {
        return money;
    }

    public List<Transport> getTransports() {
        return transports;
    }


    
}
