package com.project.euler.problems.Problem6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem6Test {

    @Test
    public void testRun() {
        Problem6 problem6 = new Problem6();
        assertEquals(2640, problem6.run(10));
        System.out.println(problem6.run(100));
    }
}