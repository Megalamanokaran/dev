package com.example;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    private Main main;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        main = new Main();
        System.setOut(new PrintStream(outContent)); // Redirect output for testing
    }

    @Test
    public void testPrintEvenNumbers() {
        main.printEvenNumbers();
        assertEquals("numbers: 2 4 6 8 10", outContent.toString().trim());
    }
}
