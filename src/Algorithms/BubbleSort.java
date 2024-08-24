package Algorithms;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        int[] random = createRandomArray(10);
        printArray("before bubble sort", random);
        bubbleSort(random);
        printArray("after bubble sort", random);
    }

    private static void bubbleSort(int[] list) {
        int length = list.length;
        for (int y = 0; y < length; y++) {
            for (int x = 1; x < length; x++) {
                if (list[x] < list[x - 1]) {
                    swap(list, x, x - 1);
                }
            }
        }
    }

    private static void swap(int[] list, int index1, int index2) {
        int temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

    private static int[] createRandomArray(int size) {
        int[] random = new int[size];
        Random rand = new Random();
        for (int i = 0; i < random.length; i++) {
            random[i] = rand.nextInt(100);
        }
        return random;
    }

    private static void printArray(String message, int[] arr) {
        System.out.println(message);
        System.out.println(Arrays.toString(arr));
    }

}




