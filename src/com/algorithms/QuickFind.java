package com.algorithms;

public class QuickFind implements UnionFind {

    private int[] ids;

    public QuickFind(int n) {
        for (int i = 0; i < n; i++) {
            ids[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        int pid = ids[p];
        int qid = ids[q];

        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == pid) {
                ids[i] = qid;
            }
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return ids[p] == ids[q];
    }

    @Override
    public int count() {
        return ids.length;
    }
}
