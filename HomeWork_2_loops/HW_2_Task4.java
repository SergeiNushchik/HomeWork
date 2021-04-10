package HomeWork_2_loops;

import java.util.Arrays;
import java.util.Scanner;

public class HW_2_Task4 {
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);
        //System.out.print("Enter a number: ");
        int a = 4;
        for (int i = 2; i <= 9; i++) {
            System.out.println();
            if (i <= 9 / a  ) {
                for (int j = 1; j <= 10; j++) {
                    //int [] arr= {i, j, i*j};

                    System.out.println(i + " * " + j + " = " + (i * j) + "  ");
                    // System.out.println(Arrays.toString(arr));
                }
            }
        }
    }

}






