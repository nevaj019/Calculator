package org.example;

import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    // Diese Methode wird vor jedem Test ausgeführt und initialisiert die Calculator-Instanz
    @BeforeEach
    void setUp() {
        calculator = new Calculator();  // Instanz von Calculator erstellen
    }

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));  // Test für Addition
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));  // Test für Subtraktion
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));  // Test für Multiplikation
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3));  // Test für Division
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));  // Test für Division durch 0
    }

    @Test
    void testSquareRoot() {
        assertEquals(3.0, calculator.squareRoot(9));  // Test für Quadratwurzel
        assertEquals(4.0, calculator.squareRoot(16));  // Test für Quadratwurzel
    }

    @Test
    void testSquareRootNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-1));  // Test für Quadratwurzel von negativen Zahlen
    }
}
