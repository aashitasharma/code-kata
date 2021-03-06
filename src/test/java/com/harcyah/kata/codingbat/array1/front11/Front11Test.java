package com.harcyah.kata.codingbat.array1.front11;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Front11Test {

    @Test
    public void testFront11() {
        Front11 front11 = new Front11();
        Assertions.assertThat(front11.front11(new int[]{1, 2, 3}, new int[]{7, 9, 8})).isEqualTo(new int[]{1, 7});
        Assertions.assertThat(front11.front11(new int[]{1}, new int[]{2})).isEqualTo(new int[]{1, 2});
        Assertions.assertThat(front11.front11(new int[]{1, 7}, new int[]{})).isEqualTo(new int[]{1});
        Assertions.assertThat(front11.front11(new int[]{}, new int[]{2, 8})).isEqualTo(new int[]{2});
        Assertions.assertThat(front11.front11(new int[]{}, new int[]{})).isEqualTo(new int[]{});
        Assertions.assertThat(front11.front11(new int[]{3}, new int[]{1, 4, 1, 9})).isEqualTo(new int[]{3, 1});
        Assertions.assertThat(front11.front11(new int[]{1, 4, 1, 9}, new int[]{})).isEqualTo(new int[]{1});
    }

}
