package org.example;

public class Calculator {

        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public int divide(int a, int b) {
            if (b == 0) throw new IllegalArgumentException("Division by zero");
            return a / b;
        }

    public double squareRoot(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(a);
    }
    public String toBinary(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot convert a negative number to binary.");
        }
        return Integer.toBinaryString(a);  // Umwandlung der Zahl in Binärformat
    }


}
