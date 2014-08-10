package com.project.euler.problems.Problem5;

import java.util.stream.IntStream;

public class Problem5 {
    private int number;

    public Problem5() {
        number = 1;
    }

    public int run(int limit) {
        IntStream stream = IntStream.rangeClosed(1, limit);
        stream.forEach(this::calculateNumber);
        return number;
    }

    private void calculateNumber(int value) {
        if (number % value != 0) {
            int gcm = new GreatestCommonDivisorCalculator(number, value).calculateGCM();
            number *= (value / gcm);
        }
    }
}


