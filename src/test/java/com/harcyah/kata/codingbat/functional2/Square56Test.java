package com.harcyah.kata.codingbat.functional2;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class Square56Test {

    @Test
    public void testSquare56() {
        Square56 square56 = new Square56();
        assertThat(square56.square56(Arrays.asList(3, 1, 4))).containsExactly(19, 11);
        assertThat(square56.square56(Arrays.asList(1))).containsExactly(11);
        assertThat(square56.square56(Arrays.asList(2))).containsExactly(14);
        assertThat(square56.square56(Arrays.asList(3))).containsExactly(19);
        assertThat(square56.square56(Arrays.asList(4))).containsExactly();
        assertThat(square56.square56(Arrays.asList(5))).containsExactly();
        assertThat(square56.square56(Arrays.asList(6))).containsExactly();
        assertThat(square56.square56(Arrays.asList(7))).containsExactly(59);
        assertThat(square56.square56(Arrays.asList(1, 2, 3, 4, 5, 6, 7))).containsExactly(11, 14, 19, 59);
        assertThat(square56.square56(Arrays.asList(3, -1, -4, 1, 5, 9))).containsExactly(19, 11, 11, 91);
    }

}
