package com.project.euler.problems.Problem2;


import java.util.stream.LongStream;
import java.util.stream.StreamSupport;

public class Problem2 {
    public long run(long limit) {
        LongStream fibonacciStream = StreamSupport.longStream(new FibonacciSupplier(n -> n <= limit), false);
        return fibonacciStream.filter(n -> n % 2 == 0).sum();
    }

}
