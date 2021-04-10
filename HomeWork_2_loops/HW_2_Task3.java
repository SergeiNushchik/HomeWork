package HomeWork_2_loops;

import java.util.Arrays;
import java.util.Scanner;

public class HW_2_Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите число которое необходимо возвести в степень ");
        String a = in.nextLine();
        double c = Double.parseDouble(a);

        System.out.println(" Введите число которое необходимо возвести в степень ");

        if (in.hasNextInt()) {
            int b = in.nextInt();
           if (b <= 0 ){
               System.out.println("Вы допустили ошибку при вводе степени \nДопускаються только положительные числа ");
           }else {

             traid(c, b);
           }
        } else  {
            System.out.println("Вы допустили ошибку при вводе степени \nДопускаються только целые числа ");
        }

    }

    public static void traid(double f, int g) {
        double result = 1;
        for (int i = 1; i <= g; i++) {
            result = result * f;}

            System.out.println(f+" ^ "+ g + " = " + result);
        }

}




