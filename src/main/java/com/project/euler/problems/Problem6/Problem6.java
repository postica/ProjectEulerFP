package com.project.euler.problems.Problem6;

import java.util.stream.IntStream;

public class Problem6 {

    public int run(int limit) {
        IntStream streamOne = IntStream.rangeClosed(1, limit);
        IntStream streamTwo = IntStream.rangeClosed(1, limit);
        int sumOfSquareElements = streamOne.map(operand -> operand * operand).sum();
        int sumOfElements = streamTwo.sum();
        return sumOfElements * sumOfElements - sumOfSquareElements;
    }

}
