package HomeWork_2.loops;

import java.util.Scanner;

public class HW_2_Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        if (in.hasNextInt()) {
            int a = Integer.parseInt(in.next());
            if (a>0) {
                int result = 1;
                System.out.print(result);
                for (int i = result + 1; i <= a; i++) {
                    result = result * i;
                    System.out.print("*" + i);
                }
                System.out.println(" = " + result);
            } else {
                System.out.println("Вы ввели отрицательное число");
        }
        } else {

            System.out.println("Упс.......Вы ввели не целое число либо букву");
        }

    }

}



