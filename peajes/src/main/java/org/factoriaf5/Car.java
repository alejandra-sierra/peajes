package org.factoriaf5;

public class Car extends Transport {
    
        public Car(String name, String city, String plate){
            super(name, city, plate);
        }
    
        @Override
        public double calculateFee() {
            return 100;
        }
    }
    