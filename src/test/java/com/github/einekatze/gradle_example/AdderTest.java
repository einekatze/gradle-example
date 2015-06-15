package com.github.einekatze.gradle_example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdderTest {
    @Test
    public void testAdd() throws Exception {
        long result = new Adder().add(3, 5);
        assertEquals(8, result);
    }
}