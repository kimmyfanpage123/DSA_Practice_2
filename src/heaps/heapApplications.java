package heaps;

import java.util.*;

public class heapApplications {

    public static void main(String[] args) {
        testPracticeOne();
        testPracticeTwo();
    }

    // Java program to find k most frequent element
    // using hash map and sorting
    public static void testPracticeOne(){
        int[] arr = {3, 1, 4, 4, 5, 2, 6, 1};
        int k = 2;
        ArrayList<Integer> res = topKFrequent(arr, k);

        for (int val : res)
            System.out.print(val + " ");
    }

    // Comparison function to sort the frequency array
    static class Compare implements Comparator<int[]> {
        public int compare(int[] p1, int[] p2) {

            // Prioritise element's value in case their frequency was same
            if (p1[0] == p2[0])
                return Integer.compare(p1[1], p2[1]);

            // Sort on the basis of increasing order
            // of frequencies (for min heap behavior)
            return Integer.compare(p1[0], p2[0]);
        }
    }

    // Function to find k numbers with most occurrences
    static ArrayList<Integer> topKFrequent(int[] arr, int k) {
        // HashMap 'mp' implemented as frequency hash table

        // Priority queue (Min-Heap) with custom comparator

        // populate priority queue with top k frequencies

        // store the result as an ArrayList<Integer>

        // reverse the result and return

        return null;
    }

    public static void testPracticeTwo()
    {
        int[][] arr = { { 2, 6, 12 },
                { 1, 9 },
                { 23, 34, 90, 2000 } };
        System.out.println(
                mergeKArrays(arr, arr.length)
                        .toString());
    }

    private static class HeapNode
            implements Comparable<HeapNode> {
        int x;
        int y;
        int value;

        HeapNode(int x, int y, int value)
        {
            this.x = x;
            this.y = y;
            this.value = value;
        }

        @Override public int compareTo(HeapNode hn)
        {
            if (this.value <= hn.value) {
                return -1;
            }
            else {
                return 1;
            }
        }
    }

    // Function to merge k sorted arrays.
    public static ArrayList<Integer>
    mergeKArrays(int[][] arr, int K)
    {
        // Create a result ArrayList<Integer> and Min-Heap

        // Initially add only first column of elements. First
        // element of every array


        // Create a variable to hold the current HeapNode


        // Iterate until the heap is empty

            // Add the values to the result


            // Check if next element of curr min exists,
            // then add that to heap.

        return null;
    }
}
