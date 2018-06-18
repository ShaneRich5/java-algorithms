package com.algorithms;

import java.util.Random;

public class Main {
    private static int ELEMENT_COUNT = 1000;

    public static void main(String[] args) {
        UnionFind quickFind = new QuickFind(ELEMENT_COUNT);
        UnionFind quickUnion = new QuickUnion(ELEMENT_COUNT);

        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int first = random.nextInt(ELEMENT_COUNT);
            int second = random.nextInt(ELEMENT_COUNT);

            quickFind.union(first, second);
            quickUnion.union(first, second);
        }

        System.out.println("Quick Find array: " + quickFind);
        System.out.println("Quick Union array: " + quickUnion);

        int pointOne = random.nextInt(ELEMENT_COUNT);
        int pointTwo = random.nextInt(ELEMENT_COUNT);

        System.out.println("Point A (" + pointOne + ") Point B (" + pointTwo + ")");

        long quickFindStartTime = System.currentTimeMillis();
        boolean quickFindResult = quickFind.connected(pointOne, pointTwo);
        long quickFindTotalTime = quickFindStartTime - System.currentTimeMillis();
        System.out.println("Quick Find\nResult: " + quickFindResult + "\nRuntime: " + quickFindTotalTime);

        long quickUnionStartTime = System.currentTimeMillis();
        boolean quickUnionResult = quickUnion.connected(pointOne, pointTwo);
        long quickUnionTotalTime = quickUnionStartTime - System.currentTimeMillis();
        System.out.println("Quick Find\nResult: " + quickUnionResult + "\nRuntime: " + quickUnionTotalTime);

    }
}
