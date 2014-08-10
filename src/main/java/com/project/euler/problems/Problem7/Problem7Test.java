package com.project.euler.problems.Problem7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem7Test {

    @Test
    public void testRun() throws Exception {
        Problem7 problem7 = new Problem7();
        assertEquals(13, problem7.run(6));
        System.out.println(problem7.run(10001));
    }
}