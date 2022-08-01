package model;

import org.junit.jupiter.api.Test;

import javax.annotation.processing.AbstractProcessor;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @Test
    void processZero() {
        Calculate calculate = new Calculate(new int[]{0, 0, 0}, new boolean[]{true, false, true});

        assertEquals(0, calculate.process());
    }

    @Test
    void process() {
        Calculate calculate = new Calculate(new int[]{1, 2, 3}, new boolean[]{false, false, true});

        assertEquals(0, calculate.process());
    }

}