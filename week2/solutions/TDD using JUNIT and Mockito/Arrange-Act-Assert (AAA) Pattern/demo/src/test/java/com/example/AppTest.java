package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private App app;

    @BeforeEach
    void setUp() {
        app = new App();
        System.out.println("Before each test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each test");
    }

    @Test
    void testAdd() {
        assertEquals(6, app.multiply(2, 3));
    }

    @Test
    void testIsEven() {
        assertTrue(app.isEven(4));
    }
}
