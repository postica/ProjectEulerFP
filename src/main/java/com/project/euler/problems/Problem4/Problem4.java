package com.project.euler.problems.Problem4;

import java.util.stream.IntStream;

public class Problem4 {
    private int palindromicNumber;

    public int run() {
        IntStream streamOne = IntStream.range(100, 1000);
        streamOne.forEach(this::calculate);
        return palindromicNumber;
    }

    private void calculate(int value) {
        IntStream streamTwo = IntStream.range(100, 1000);
        streamTwo.forEach(n -> testPalindromicNumber(n * value));
    }

    private void testPalindromicNumber(int n) {
        int aux = n;
        int reversed = 0;
        while (aux != 0) {
            reversed = reversed * 10 + aux % 10;
            aux /= 10;
        }
        if (n == reversed && palindromicNumber < reversed)
            palindromicNumber = reversed;
    }
}
