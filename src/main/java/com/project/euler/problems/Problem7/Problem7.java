package com.project.euler.problems.Problem7;

import java.util.stream.LongStream;

public class Problem7 {

    public long run(long limit) {
        LongStream primeStream = LongStream.generate(new PrimeSupplier());
        return primeStream.limit(limit).max().getAsLong();
    }

}
