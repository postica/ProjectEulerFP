package com.project.euler.problems.Problem12;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem12Test {

    @Test
    public void testRun() throws Exception {
        Problem12 problem12 = new Problem12();
        assertEquals(28, problem12.run(5));
        System.out.println(problem12.run(500));
    }
}