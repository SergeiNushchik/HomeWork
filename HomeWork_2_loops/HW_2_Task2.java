package HomeWork_2_loops;

import java.util.Arrays;
import java.util.Scanner;

public class HW_2_Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        if (in.hasNextInt()){
            traid(in.next());
        }else {
            if (in.hasNextDouble()){
                System.out.println("Введено не целое число");
            }else {
                System.out.println("Введено не число");
                }
            }
        }
    public static void traid(String in){
        int[] numArr = Arrays.stream(in.split("")).mapToInt(Integer::parseInt).toArray();
        int result = numArr[0];
        System.out.print(result);
        for (int i = 1; i < numArr.length; i++) {
            result = result * numArr[i];
            System.out.print(" * " + numArr[i]);
        }
        System.out.println(" = " + result);
    }
}




