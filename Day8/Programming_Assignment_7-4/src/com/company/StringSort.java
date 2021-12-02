package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
    Comparator myComparator;

    StringSort(Comparator<String> myComparator) {
        this.myComparator = myComparator;
    }

    public String[] stringSort(String[] arr) {
        Arrays.sort(arr, myComparator);
        return arr;
    }

    static abstract class LengthCompare implements Comparator {
        abstract public int compare(Object o1, Object o2);

    }
}
