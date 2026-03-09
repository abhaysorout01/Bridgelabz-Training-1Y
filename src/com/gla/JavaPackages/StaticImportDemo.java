package com.gla.JavaPackages;

import static java.lang.Math.*;

public class StaticImportDemo {

    public static void main(String[] args) {

        double num1 = 16;
        double num2 = 4;

        // 1. sqrt() – square root
        double root = sqrt(num1);
        System.out.println("Square root of " + num1 + " is " + root);

        // 2. pow() – power
        double power = pow(num1, num2);
        System.out.println(num1 + " raised to " + num2 + " is " + power);

        // 3. max() – maximum
        double maximum = max(num1, num2);
        System.out.println("Maximum of " + num1 + " and " + num2 + " is " + maximum);

        // 4. min() – minimum
        double minimum = min(num1, num2);
        System.out.println("Minimum of " + num1 + " and " + num2 + " is " + minimum);

        // 5. abs() – absolute value
        double negative = -25.5;
        System.out.println("Absolute value of " + negative + " is " + abs(negative));
    }
}