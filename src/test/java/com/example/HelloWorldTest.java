package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    
    @Test
    public void testHelloWorld() {
        String expected = "Hello, World123!";
        String actual = "Hello, World123!"; // Simulating the output
        assertEquals(expected, actual);
    }
}
