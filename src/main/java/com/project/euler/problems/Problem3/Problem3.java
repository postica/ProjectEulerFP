package com.project.euler.problems.Problem3;

import java.util.stream.LongStream;
import java.util.stream.StreamSupport;

public class Problem3 {
    public long run(long number) {
        LongStream primeStream = StreamSupport.longStream(new PrimeSupplier(new PrimeFactorsPredicate(number)), false);
        return primeStream.max().getAsLong();
    }

}
