package com.tuyji.springwork.sortalgorithm;

public class Tester {

    public static void main(String[] args) {

        SortAlgorithmImpl impl = new SortAlgorithmImpl(new QuickSortAlgorithm());
        int result = impl.binarySearch(new int[]{1, 2, 5, 6, 8}, 5);
        System.out.println(result);

    }
}
