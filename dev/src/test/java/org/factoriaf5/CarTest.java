package org.factoriaf5;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CarTest {



    @Test
    public void testCalculateFee() {
        Car car = new Car("peritos", "gijon", "0015JFZ");
        
        assertEquals(100, car.calculateFee(), "El peaje es de 100");
    }
}

    

