package utils;

import java.util.Random;

public class DataGenerator {

    public static int[] generateRandomArray (int size, int max){
        int[] randomArray = new int[size];
        Random random = new Random();

        for (int i=0; i<randomArray.length; i++){
            randomArray[i] = random.nextInt(max);
        }
        return randomArray;
    }
}
