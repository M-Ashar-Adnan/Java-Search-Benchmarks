package runner;

import algorithms.BinarySearch;
import algorithms.LinearSearch;
import utils.DataGenerator;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 100000, 1000000, 5000000};
        Random rand = new Random();

        System.out.println("--- COMPREHENSIVE BENCHMARK STARTED ---");
        System.out.println("Size,LinearWorst(ns),LinearAvg(ns),BinaryCustom(ns),BinaryJava(ns)");

        for (int size : sizes) {

            // 1. SETUP
            int[] data = DataGenerator.generateRandomArray(size, 10000000);
            Arrays.sort(data);

            // Targets
            int targetWorst = data[data.length - 1];          // Last Element of the Array
            int targetAvg   = data[rand.nextInt(size)];       // Random Element

            // 2. LINEAR SEARCH (WORST CASE)
            long start = System.nanoTime();
            LinearSearch.search(data, targetWorst);
            long linearWorstTime = System.nanoTime() - start;

            // 3. LINEAR SEARCH (AVERAGE CASE)
            start = System.nanoTime();
            LinearSearch.search(data, targetAvg);
            long linearAvgTime = System.nanoTime() - start;

            // 4. BINARY SEARCH
            start = System.nanoTime();
            BinarySearch.search(data, targetAvg);
            long binaryCustomTime = System.nanoTime() - start;

            // 5. JAVA'S BUILT-IN BINARY SEARCH
            start = System.nanoTime();
            Arrays.binarySearch(data, targetAvg);
            long binaryJavaTime = System.nanoTime() - start;

            System.out.println(size + "," + linearWorstTime + "," + linearAvgTime + "," + binaryCustomTime + "," + binaryJavaTime);
        }

        System.out.println("--- BENCHMARK COMPLETE ---");
    }
}