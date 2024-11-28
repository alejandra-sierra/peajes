package org.factoriaf5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MotorbikeTest {

    @Test
    public void testCalculateFee() {
        Motorbike motorbike = new Motorbike("peirtos", "gijon", "0015JFX");
        
        assertEquals(50, motorbike.calculateFee(), "El peaje para la moto debe ser 50");
    }
}
