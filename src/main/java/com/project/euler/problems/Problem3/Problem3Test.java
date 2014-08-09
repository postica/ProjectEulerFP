package com.project.euler.problems.Problem3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem3Test {

    @Test
    public void testRun() throws Exception {
        Problem3 problem3 = new Problem3();
        assertEquals(5, problem3.run(10));

        long timeMillis = System.currentTimeMillis();

        System.out.println(problem3.run(600851475143L));

        System.out.println(System.currentTimeMillis() - timeMillis);
    }
}