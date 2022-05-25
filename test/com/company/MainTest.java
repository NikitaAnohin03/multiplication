package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        assertEquals(2 * 3, Main.multiply(2, 3));
    }

    @Test
    void main2() {
        assertEquals(2 * 0, Main.multiply(2, 0));
    }

    @Test
    void main3() {
        assertEquals(2 * (-3), Main.multiply(2, (-3)));
    }

    @Test
    void main4() {
        assertEquals((-2) * (-3), Main.multiply((-2), (-3)));
    }

    @Test
    void main5() {
        assertEquals(15236 * 3975746, Main.multiply(15236, 3975746));
    }

    @Test
    void main6() {
        assertEquals(0 * 0, Main.multiply(0, 0));
    }

    @Test
    void main7() {
        assertEquals((-2) * 3, Main.multiply((-2), 3));
    }
}