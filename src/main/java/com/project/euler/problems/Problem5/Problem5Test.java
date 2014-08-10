package com.project.euler.problems.Problem5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem5Test {

    @Test
    public void testRun() throws Exception {
        Problem5 problem5 = new Problem5();
        assertEquals(2520, problem5.run(10));
        System.out.println(problem5.run(20));
    }
}