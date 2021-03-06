package com.harcyah.kata.exercism.clock;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ClockEqualTest {


    @Test
    public void clocksWithSameTimeAreEqual() {
        assertTrue(new Clock(15, 37).equals(new Clock(15, 37)));
    }


    @Test
    public void clocksAMinuteApartAreNotEqual() {
        assertFalse(new Clock(15, 36).equals(new Clock(15, 37)));
    }


    @Test
    public void clocksAnHourApartAreNotEqual() {
        assertFalse(new Clock(14, 37).equals(new Clock(15, 37)));
    }


    @Test
    public void clocksWithHourOverflow() {
        assertTrue(new Clock(10, 37).equals(new Clock(34, 37)));
    }


    @Test
    public void clocksWithHourOverflowBySeveralDays() {
        assertTrue(new Clock(3, 11).equals(new Clock(99, 11)));
    }


    @Test
    public void clocksWithNegateHour() {
        assertTrue(new Clock(22, 40).equals(new Clock(-2, 40)));
    }


    @Test
    public void clocksWithNegativeHourThatWraps() {
        assertTrue(new Clock(17, 3).equals(new Clock(-31, 3)));
    }


    @Test
    public void clocksWithNegativeHourThatWrapsMultipleTimes() {
        assertTrue(new Clock(13, 49).equals(new Clock(-83, 49)));
    }


    @Test
    public void clocksWithMinuteOverflow() {
        assertTrue(new Clock(0, 1).equals(new Clock(0, 1441)));
    }


    @Test
    public void clocksWithMinuteOverflowBySeveralDays() {
        assertTrue(new Clock(2, 2).equals(new Clock(2, 4322)));
    }


    @Test
    public void clocksWithNegativeMinutes() {
        assertTrue(new Clock(2, 40).equals(new Clock(3, -20)));
    }


    @Test
    public void clocksWithNegativeMinutesThatWraps() {
        assertTrue(new Clock(4, 10).equals(new Clock(5, -1490)));
    }


    @Test
    public void clocksWithNegativeMinutesThatWrapsMultipleTimes() {
        assertTrue(new Clock(6, 15).equals(new Clock(6, -4305)));
    }


    @Test
    public void clocksWithNegativeHoursAndMinutes() {
        assertTrue(new Clock(7, 32).equals(new Clock(-12, -268)));
    }


    @Test
    public void clocksWithNegativeHoursAndMinutesThatWrap() {
        assertTrue(new Clock(18, 7).equals(new Clock(-54, -11513)));
    }
}
