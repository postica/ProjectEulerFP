package com.project.euler.problems.Problem5;

import java.util.stream.IntStream;

public class GreatestCommonDivisorCalculator {
    private final int a;
    private final int b;
    private int gcm;

    public GreatestCommonDivisorCalculator(int a, int b) {
        this.a = Math.max(a, b);
        this.b = Math.min(a, b);
        gcm = 1;
    }

    public int calculateGCM() {
        if (a % b == 0) return b;
        IntStream stream = IntStream.rangeClosed(2, b / 2);
        stream.forEach(this::updateGCM);
        return gcm;
    }

    private void updateGCM(int i) {
        if (a % i == 0 && b % i == 0)
            gcm = i;
    }
}
