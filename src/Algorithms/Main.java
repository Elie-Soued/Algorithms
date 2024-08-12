package Algorithms;
import java.util.Arrays;

public class Main {
    public static void main(String[] args ){
        int[] listForBubbleSort = {1,15,8,4,37,5,9,88,13};
        int [] result = BubbleSort.bubbleSort(listForBubbleSort);
        System.out.println(Arrays.toString(result));
    }
}
