package com.github.einekatze.gradle_example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Allows calculating the sum of two numbers.
 */
public class Adder {
    private static Logger log = LoggerFactory.getLogger(Adder.class);

    /**
     * Adds two numbers and returns the result.
     * @param a The first number.
     * @param b The second number.
     * @return The sum of a and b.
     */
    public int add(int a, int b) {
        log.debug("Adding {} to {}!", a, b);
        return a + b;
    }
}
