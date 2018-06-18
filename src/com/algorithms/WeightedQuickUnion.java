package com.algorithms;

import java.util.Arrays;

public class WeightedQuickUnion implements UnionFind {

    private int ids[];
    private int size[];

    public WeightedQuickUnion(int n) {
        ids = new int[n];
        size = new int[n];

        for (int i = 0; i < n; i++) {
            ids[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        int proot = ids[p];
        int qroot = ids[q];

        if (proot == qroot) {
            return;
        }

        if (size[proot] < size[qroot]) {
            ids[proot] = qroot;
            size[qroot] += size[proot];
        } else {
            ids[qroot] = proot;
            size[proot] += size[qroot];
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public int count() {
        return ids.length;
    }

    private int root(int index) {
        while (ids[index] != index)
            index = ids[index];
        return index;
    }

    @Override
    public String toString() {
        return Arrays.toString(ids);
    }
}
