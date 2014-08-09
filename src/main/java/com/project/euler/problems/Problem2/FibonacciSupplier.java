package com.project.euler.problems.Problem2;

import java.util.Spliterators;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

import static com.google.common.base.Preconditions.checkNotNull;

public class FibonacciSupplier extends Spliterators.AbstractLongSpliterator {
    private final LongPredicate hasNext;
    private long previous = 1;
    private long previous2 = 1;

    public FibonacciSupplier(LongPredicate hasNext) {
        super(Long.MAX_VALUE, 0);
        this.hasNext = hasNext;
    }

    private long getNextFibonacciElement() {
        long current = previous + previous2;
        previous2 = previous;
        previous = current;
        return current;
    }

    @Override
    public boolean tryAdvance(LongConsumer action) {
        checkNotNull(action);
        long current = getNextFibonacciElement();
        if (!hasNext.test(current)) {
            return false;
        }
        action.accept(current);
        return true;
    }
}
