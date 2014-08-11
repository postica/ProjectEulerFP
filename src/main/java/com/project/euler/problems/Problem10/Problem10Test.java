package com.project.euler.problems.Problem10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem10Test {

    @Test
    public void testRun() throws Exception {
        Problem10 problem10 = new Problem10();
        assertEquals(17, problem10.run(10));
        System.out.println(problem10.run(2000000));
    }
}