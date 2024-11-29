package org.factoriaf5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TrasportTest {

    static class ConcreteTransport extends Transport {
        public ConcreteTransport(String name, String city, String plate) {
            super(name, city, plate);
        }

        @Override
        public double calculateFee() {
            return 0; 
        }
    }

    @Test
    public void testGetters() {
        Transport transport = new ConcreteTransport("Peritos", "gijon", "0015JFZ");

        assertEquals("Peritos", transport.getName(), "El nombre no es correcto");
        assertEquals("gijon", transport.getCity(), "La ciudad no es correcta");
        assertEquals("0015JFZ", transport.getPlate(), "La placa no es correcta");
    }
}

    

