package heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class heapApplications {

    public static void main(String[] args) {
        testPracticeOne();
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
}
