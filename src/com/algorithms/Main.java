package com.algorithms;

import java.util.Random;

public class Main {
    private static int ELEMENT_COUNT = 1000;

    public static void main(String[] args) {
        UnionFind quickFind = new QuickFind(ELEMENT_COUNT);
        UnionFind quickUnion = new QuickUnion(ELEMENT_COUNT);

        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int first = random.nextInt(ELEMENT_COUNT);
            int second = random.nextInt(ELEMENT_COUNT);

            quickFind.union(first, second);
            quickUnion.union(first, second);
        }



        System.out.println("current time: " + System.currentTimeMillis());
    }
}
