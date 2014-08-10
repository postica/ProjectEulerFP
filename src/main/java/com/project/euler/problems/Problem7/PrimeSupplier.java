package com.project.euler.problems.Problem7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.LongSupplier;

public class PrimeSupplier implements LongSupplier {
    private final List<Long> previousPrimes;
    private long currentPrime;

    public PrimeSupplier() {
        previousPrimes = new ArrayList<>();
        currentPrime = 1;
    }

    public long nextPrime() {
        for (currentPrime = currentPrime + 1; !isPrime(currentPrime); currentPrime++) ;
        previousPrimes.add(currentPrime);
        return currentPrime;
    }

    private boolean isPrime(long primeCandidate) {
        if (previousPrimes.size() > 0) {
            for (long primeNumber : previousPrimes) {
                if (primeCandidate % primeNumber == 0) return false;
                if (primeCandidate < primeNumber * primeNumber) break;
            }
        }
        for (long i = 2; i <= Math.sqrt(primeCandidate); i++) {
            if (primeCandidate % i == 0)
                return false;
        }
        return true;
    }

    @Override
    public long getAsLong() {
        currentPrime = nextPrime();
        return currentPrime;
    }
}
