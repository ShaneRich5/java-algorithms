package com.algorithms;

/**
 * Maintains a forest using an array to maintain
 * connected components
 */
public class QuickUnion implements UnionFind {

    private int ids[];

    public QuickUnion(int n) {
        for (int i = 0; i < n; i++) {
            ids[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        int proot = root(p);
        int qroot = root(q);

        ids[proot] = qroot;
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
}
