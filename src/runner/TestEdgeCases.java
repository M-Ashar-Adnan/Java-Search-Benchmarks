package runner;

import algorithms.BinarySearch;
import algorithms.LinearSearch;

public class TestEdgeCases {
    public static void main(String[] args) {
        System.out.println("--- STARTING EDGE CASE TESTS ---");

        // TEST 1: The "Not Found" Case
        int[] basicArray = {10, 20, 30, 40, 50};
        int missingTarget = 99;

        if (BinarySearch.search(basicArray, missingTarget) == -1) {
            System.out.println("[PASS] Returns -1 when number is missing.");
        } else {
            System.out.println("[FAIL] Did not return -1 for missing number.");
        }

        // TEST 2: Empty Array
        int[] emptyArray = {};
        if (LinearSearch.search(emptyArray, 5) == -1) {
            System.out.println("[PASS] Handles empty array without crashing.");
        } else {
            System.out.println("[FAIL] Crashed or failed on empty array.");
        }

        // TEST 3: Single Element Array
        int[] single = {100};
        if (BinarySearch.search(single, 100) == 0) {
            System.out.println("[PASS] Finds element in size-1 array.");
        } else {
            System.out.println("[FAIL] Failed on size-1 array.");
        }

        // TEST 4: First and Last Elements (Boundary Checks)
        if (BinarySearch.search(basicArray, 10) == 0 && BinarySearch.search(basicArray, 50) == 4) {
            System.out.println("[PASS] Correctly finds first and last items.");
        } else {
            System.out.println("[FAIL] Boundary check failed.");
        }

        System.out.println("--- ALL TESTS FINISHED ---");
    }
}