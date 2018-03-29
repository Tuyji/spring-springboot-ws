package com.tuyji.springwork.sortalgorithm;

public class SortAlgorithmImpl {

    SortAlgorithm sortAlgorithm;

    public SortAlgorithmImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearch){
        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        return 3;
    }
}
