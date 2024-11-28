package org.factoriaf5;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FeeTest {


    @Test
    public void testAddTransport() {
        Fee fee = new Fee("peritos", "gijon", 0, new ArrayList<>());
        Car car = new Car("peritos", "gijon", "0015JFZ");
        Motorbike motorbike = new Motorbike("peritos", "gijon", "0015JFX");

        fee.addTransport(car);
        fee.addTransport(motorbike);

        assertEquals(150, fee.getMoney(), "El total es de 150");
        
        assertEquals(2, fee.getTransports().size(), " 2 vehículos registrados");
    }

    @Test
    public void testReport() {
        Fee fee = new Fee("peritos", "gijon", 0, new ArrayList<>());
        Car car = new Car("peritos", "gijon", "0015JFZ");
        Motorbike motorbike = new Motorbike("peritos", "gijon", "0015JFX");

        fee.addTransport(car);
        fee.addTransport(motorbike);

        fee.report();
    }
}

    
