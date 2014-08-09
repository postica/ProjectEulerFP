package com.project.euler.problems.Problem2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem2Test {

    @Test
    public void testRun() throws Exception {
        Problem2 problem2 = new Problem2();
        assertEquals(10, problem2.run(10));
        System.out.println(problem2.run(4000000));
    }
}