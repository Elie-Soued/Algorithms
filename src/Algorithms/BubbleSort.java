package Algorithms;

public class BubbleSort {
    public static int[] bubbleSort(int[] list) {
        int length = list.length;
        for (int y = 0; y < length; y++) {
            for (int x = 1; x < length; x++) {
                if (list[x] < list[x - 1]) {
                    int temp = list[x];
                    list[x] = list[x - 1];
                    list[x - 1] = temp;
                }
            }
        }
        return list;
    }
}