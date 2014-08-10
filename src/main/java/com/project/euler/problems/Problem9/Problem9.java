package com.project.euler.problems.Problem9;

import java.util.stream.IntStream;

public class Problem9 {
    public final int sum;
    public int product;

    public Problem9(int sum) {
        this.sum = sum;
    }

    public int run() {
        IntStream streamOne = IntStream.range(0, sum);
        streamOne.reduce((a, b) -> {
            IntStream streamTwo = IntStream.rangeClosed(b + 1, sum);
            return streamTwo.reduce((left, right) -> {
                int result = right * right + b * b;
                if ((Math.sqrt(result) * Math.sqrt(result) == result) && (right + b + Math.sqrt(result) == sum))
                    product = (int) (right * b * Math.sqrt(result));
                return product;
            }).getAsInt();
        });
        return product;
    }
}
