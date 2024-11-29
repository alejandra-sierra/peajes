package org.factoriaf5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TruckTest {

    @Test
    public void testCalculateFee() {
        Truck truck = new Truck("peritos", "gijon", "0015JHG", 4);
        
        assertEquals(200, truck.calculateFee(), "El peaje para un camión con 4 ejes es de 200");
    }
}

    

