package com.interview.utils.ust;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeSortListsUsingStreams {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(5, 2, 8, 2, 1);
        List<Integer> list2 = Arrays.asList(7, 2, 3, 9, 8);
        List<Integer> mergedAndSorted = mergeAndSortLists(list1, list2);
        System.out.println("Merged and sorted list: " + mergedAndSorted);
    }

    private static List<Integer> mergeAndSortLists(List<Integer> list1, List<Integer> list2) {
        return Stream.concat(list1.stream(), list2.stream()).distinct().sorted().toList();
    }
}
