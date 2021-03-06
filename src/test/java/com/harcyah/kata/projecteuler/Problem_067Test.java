package com.harcyah.kata.projecteuler;

import com.google.common.io.Resources;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Problem_067Test {

    @Test
    public void testProblem_067() throws IOException {
        int[][] triangle = new int[100][];
        List<String> lines = Resources.readLines(getClass().getResource("projecteuler_067.txt"), StandardCharsets.UTF_8);
        for (int i = 0; i < lines.size(); i++) {
            String[] tokens = lines.get(i).split(" ");
            triangle[i] = new int[tokens.length];
            for (int j = 0; j < tokens.length; j++) {
                triangle[i][j] = Integer.parseInt(tokens[j]);
            }
        }

        Problem_067 problem_067 = new Problem_067();
        Assert.assertEquals(7273, problem_067.getMaximumSumPath(triangle));
    }

}
