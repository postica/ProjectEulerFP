package com.project.euler.problems.Problem12;

import java.util.stream.LongStream;
import java.util.stream.StreamSupport;

public class Problem12 {
    //Long running time .
    public long run(final int divisorsNumber) {
        LongStream intStream = StreamSupport.longStream(new TriangleNumberSupplier(), false);

        return intStream.filter(value -> {
            LongStream stream = LongStream.rangeClosed(1, value / 2);
            long divisorsFound = stream.filter(n -> value % n == 0).count();
            divisorsFound++;
            return divisorsFound > divisorsNumber;
        }).limit(1).min().getAsLong();
    }


}
