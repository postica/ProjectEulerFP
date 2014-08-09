package com.project.euler.problems.Problem3;

import java.util.function.LongPredicate;

public class PrimeFactorsPredicate implements LongPredicate {
    private long number;

    public PrimeFactorsPredicate(long number) {
        this.number = number;
    }

    @Override
    public boolean test(long value) {
        boolean notFound = number != 1;
        while (number % value == 0) {
            number = number / value;
        }
        return notFound;
    }
}
