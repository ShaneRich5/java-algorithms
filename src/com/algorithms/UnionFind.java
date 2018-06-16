package com.algorithms;

public interface UnionFind {

    /**
     * Adds a connection between the p and q node
     *
     * @param p an integer representing a node
     * @param q an integer representing a node
     */
    void union(int p, int q);

    /**
     * Check if nodes p and q are connected
     *
     * @param p an integer representing a node
     * @param q an integer representing a node
     * @return boolean
     */
    boolean connected(int p, int q);

    /**
     * Number of components
     *
     * @return integer
     */
    int count();
}
