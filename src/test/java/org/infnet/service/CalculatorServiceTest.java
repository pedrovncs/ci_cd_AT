package org.infnet.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {
    CalculatorService service;

    @BeforeEach
    void setUp() {
        service = new CalculatorService();
    }

    @Test
    void addShouldAdd() {
        double result = service.add(1,2);

        Assertions.assertEquals(3,result);
    }

    @Test
    void subtractShouldSubtract() {
        double result = service.subtract(2,1);

        Assertions.assertEquals(1,result);
    }

    @Test
    void multiplyShouldMultiply() {
        double result = service.multiply(6,2);

        Assertions.assertEquals(12,result);
    }

    @Test
    void divideShouldDivide() {
        double result = service.divide(6,2);

        Assertions.assertEquals(3,result);
    }

    @Test
    void divideShouldReturnZeroWhenDivideByZero() {
        double result = service.divide(2,0);

        Assertions.assertEquals(0,result);
    }
}