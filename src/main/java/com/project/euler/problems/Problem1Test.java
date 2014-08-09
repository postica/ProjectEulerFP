package com.project.euler.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem1Test {

    @Test
    public void testRun() throws Exception {
        Problem1 problem1 = new Problem1();
        assertEquals(23, problem1.run(10));
        System.out.println(problem1.run(1000));
    }
}