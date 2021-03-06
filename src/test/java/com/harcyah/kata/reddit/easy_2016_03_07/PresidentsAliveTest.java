package com.harcyah.kata.reddit.easy_2016_03_07;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.IOException;

public class PresidentsAliveTest {

    @Test
    public void testFindYearWithMostPresidentsAlive() throws IOException {
        int[] expected = new int[]{
                1822, 1823, 1824, 1825, 1826,
                1831, 1833, 1834, 1835, 1836,
                1837, 1838, 1839, 1840, 1841,
                1843, 1844, 1845
        };

        PresidentsAlive pa = new PresidentsAlive();
        Assertions.assertThat(expected).contains(pa.findYearWithMostPresidentsAlive());
    }

}
