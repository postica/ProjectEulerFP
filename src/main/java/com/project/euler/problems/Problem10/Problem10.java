package com.project.euler.problems.Problem10;


import java.util.stream.LongStream;
import java.util.stream.StreamSupport;

public class Problem10 {

    public long run(long limit) {
        LongStream primeStream = StreamSupport.longStream(new PrimeSupplier(value -> value < limit), false);
        return primeStream.sum();
    }
}
