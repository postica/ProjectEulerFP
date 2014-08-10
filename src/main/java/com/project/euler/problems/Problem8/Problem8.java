package com.project.euler.problems.Problem8;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.stream.Stream;

import static com.project.euler.problems.Problem8.BigNumber.getNumber;

public class Problem8 {
    private int product = 0;
    private int number;

    private final Queue<Integer> queue = new ArrayDeque<>(number);

    public int run(int number) {
        this.number = number;
        Stream<Integer> stream = getNumber().stream();
        stream.reduce(1, this::reduce);
        return product;
    }

    private int reduce(int a, int b) {
        int tempProduct = calculateProduct(b);
        if (tempProduct > product)
            product = tempProduct;
        return product;
    }

    private int calculateProduct(int element) {
        if (queue.size() != number) {
            queue.add(element);
        } else {
            queue.remove();
            queue.add(element);
        }
        int tempProduce = 1;
        if (queue.size() == number) {
            tempProduce = queue.stream().reduce(1, this::multiply);
        }
        return tempProduce;
    }

    private int multiply(int a, int b) {
        return a * b;
    }
}
