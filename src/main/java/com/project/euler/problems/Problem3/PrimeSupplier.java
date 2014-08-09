package com.project.euler.problems.Problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterators;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

import static com.google.common.base.Preconditions.checkNotNull;

public class PrimeSupplier extends Spliterators.AbstractLongSpliterator {
    private final LongPredicate hasNext;
    private final List<Long> previousPrimes;
    private long currentPrime;

    public PrimeSupplier(LongPredicate hasNext) {
        super(Long.MAX_VALUE, 0);
        this.hasNext = hasNext;
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
    public boolean tryAdvance(LongConsumer action) {
        checkNotNull(action);
        currentPrime = nextPrime();
        if (!hasNext.test(currentPrime)) {
            return false;
        }
        action.accept(currentPrime);
        return true;
    }
}
