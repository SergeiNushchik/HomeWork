package HomeWork_2.sorts;

import java.util.Arrays;
import java.util.Scanner;

public class SortsUtils {
    public static void main(String[] args) {

        int[] massiv = {6, 1, 5, 4, 5, 6};
        System.out.println(Arrays.toString(massiv));
        SortBubbles(massiv);
        System.out.println(Arrays.toString(massiv));
    }

    public static int[] SortBubbles(int[] arr) {

        int[] masiv = arr;

        System.out.println(arr.length);
        for (int i = 0; i < masiv.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < masiv.length; j++) {
                if (masiv[j] < masiv[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = masiv[i];
            masiv[i] = masiv[minIndex];
            masiv[minIndex] = tmp;
        }
        return masiv;
    }

}
