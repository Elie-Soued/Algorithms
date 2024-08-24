package Algorithms;

import java.util.Arrays;
import java.util.Random;

public class Quicksort {
    public static void main(String[] arg) {
        int[] random = createRandomArray(10);
        printArray("before quickSort", random);
        quicksort(0, random.length - 1, random);
        printArray("after quickSort", random);
    }

    private static void quicksort(int lowIndex, int highIndex, int[] arr) {
        if (lowIndex >= highIndex) return;
        int pivot = arr[highIndex];
        int leftPointer = partition(lowIndex, highIndex, arr, pivot);
        quicksort(lowIndex, leftPointer - 1, arr);
        quicksort(leftPointer + 1, highIndex, arr);

    }

    private static int partition(int lowIndex, int highIndex, int[] arr, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex - 1;

        while (leftPointer <= rightPointer) {
            while (leftPointer <= rightPointer && arr[leftPointer] <= pivot) leftPointer++;
            while (leftPointer <= rightPointer && arr[rightPointer] >= pivot) rightPointer--;

            if (leftPointer < rightPointer) {
                swap(leftPointer, rightPointer, arr);
            }
            swap(leftPointer, highIndex, arr);

        }
        return leftPointer;

    }

    private static void swap(int lefPointer, int rightPointer, int[] arr) {
        int temp = arr[lefPointer];
        arr[lefPointer] = arr[rightPointer];
        arr[rightPointer] = temp;
    }

    private static void printArray(String message, int[] arr) {
        System.out.println(message);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] createRandomArray(int size) {
        int[] random = new int[size];
        Random rand = new Random();
        for (int i = 0; i < random.length; i++) {
            random[i] = rand.nextInt(100);
        }
        return random;
    }

}

