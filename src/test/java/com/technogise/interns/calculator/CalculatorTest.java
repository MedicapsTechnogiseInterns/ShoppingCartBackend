package com.technogise.interns.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testTwoPlusTwoEqualsFour() {
        int FIRST_NUMBER = 2, SECOND_NUMBER = 2, EXPECTED_SUM = 4;
        Calculator calculator = new Calculator();
        int actualSum = calculator.sum(FIRST_NUMBER,SECOND_NUMBER);
        Assertions.assertEquals(EXPECTED_SUM,actualSum);
    }
    @Test
    public void testTwoMinusTwoEqualsZero() {
        int FIRST_NUMBER = 2, SECOND_NUMBER = 2, EXPECTED_DIFFERENCE = 0;
        Calculator calculator = new Calculator();
        int actualDifference = calculator.minus(FIRST_NUMBER,SECOND_NUMBER);
        Assertions.assertEquals(EXPECTED_DIFFERENCE,actualDifference);
    }

    @Test
    public void testEightDividesFourEqualsTwo() {
        int FIRST_NUMBER = 8, SECOND_NUMBER = 4, EXPECTED_QUOTIENT = 2;
        Calculator calculator = new Calculator();
        int actualQuotient = calculator.divide(FIRST_NUMBER, SECOND_NUMBER);
        Assertions.assertEquals(EXPECTED_QUOTIENT, actualQuotient);
    }

    @Test
    public void testMaxOfFourAndThreeEqualsFour() {
        int FIRST_NUMBER = 4, SECOND_NUMBER = 3, EXPECTED_MAX = 4;
        Calculator calculator = new Calculator();
        int actualMax = calculator.max(FIRST_NUMBER,SECOND_NUMBER);
        Assertions.assertEquals(EXPECTED_MAX,actualMax);
    }

    @Test
    public void testTwoMultiplyTwoEqualsFour() {
        int FIRST_NUMBER = 2, SECOND_NUMBER = 2, EXPECTED_PRODUCT = 4;
        Calculator calculator = new Calculator();
        int actualProduct = calculator.multiply(FIRST_NUMBER,SECOND_NUMBER);
        Assertions.assertEquals(EXPECTED_PRODUCT,actualProduct);
    }

    @Test
    public void testMinOfTwoAndFiveEqualsTwo() {
        int FIRST_NUMBER = 2, SECOND_NUMBER = 5, EXPECTED_MIN = 2;
        Calculator calculator = new Calculator();
        int actualMin = calculator.min(FIRST_NUMBER,SECOND_NUMBER);
        Assertions.assertEquals(EXPECTED_MIN,actualMin);
    }
}