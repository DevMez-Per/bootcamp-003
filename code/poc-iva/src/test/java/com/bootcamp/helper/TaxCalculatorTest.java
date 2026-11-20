package com.bootcamp.helper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TaxCalculatorTest {

    private static final double DELTA = 0.0001;

    @Test
    void shouldCalculateIvaWhenPriceIsGreaterThanZero() {
        double valorProducto = 100.0;
        TaxCalculator calculator = new TaxCalculator(16.0);

        double ivaCalculado = calculator.calculateIva(valorProducto);

        System.out.println(ivaCalculado); 
        assertEquals(16.0, ivaCalculado, DELTA);
    }      
    
    @Test
    void shouldCalculateIvaWhenPriceIsEqualToZero() {

        double ivaCalculado = TaxCalculator.calculateIva(0.0);

        System.out.println(ivaCalculado); 
        assertEquals(0.0, ivaCalculado, DELTA);
    }
    
    @Test
    void shouldCalculateIvaWhenPriceIsMinorThanZero() {

    	IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> TaxCalculator.calculateIva(-100.0)
            );

            assertEquals("El precio no puede ser negativo", exception.getMessage());
    }

 }