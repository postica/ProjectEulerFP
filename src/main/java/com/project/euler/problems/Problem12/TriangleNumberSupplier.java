package com.project.euler.problems.Problem12;

import java.util.Spliterators;
import java.util.function.LongConsumer;

import static com.google.common.base.Preconditions.checkNotNull;

public class TriangleNumberSupplier extends Spliterators.AbstractLongSpliterator {
    private long number = 1;
    private long sum = 0;

    protected TriangleNumberSupplier() {
        super(Integer.MAX_VALUE, 0);
    }

    @Override
    public boolean tryAdvance(LongConsumer action) {
        checkNotNull(action);
        sum = sum + number;

        action.accept(sum);
        number++;
        return true;
    }
}
