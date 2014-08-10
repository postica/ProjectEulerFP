package com.project.euler.problems.Problem8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem8Test {

    @Test
    public void testRun() throws Exception {
        Problem8 problem8 = new Problem8();
        assertEquals(5832, problem8.run(4));
    }
}