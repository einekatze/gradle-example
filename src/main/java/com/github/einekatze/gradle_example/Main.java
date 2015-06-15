package com.github.einekatze.gradle_example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** The entry point of the application. */
public class Main {
    // This line creates a Logback logger configured for this class.
    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Starting up.");

        Adder adder = new Adder();
        long result = adder.add(3, 5);

        log.info("Result: {}", result);
    }
}
