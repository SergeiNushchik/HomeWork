package HomeWork_2_arrays;


import java.util.Arrays;
import java.util.Scanner;

public class ArraysTask_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arrayLength = in.nextInt();
            arrayFromConsole(arrayLength);


       // System.out.println(Arrays.toString(container));
        System.out.println("Выберите действия которые необходимо произвести с полученным масивом:");
        System.out.println("1. Вывести все элементы в консоль.");
        System.out.println("2. Вывести каждый второй элемент массива в консоль.");
        System.out.println("3. Вывести все элементы массива в консоль в обратном порядке.");
        int varr = in.nextInt();
        switch (varr){
            case 1:
                System.out.println("1. Вывести все элементы в консоль.");
               // outputOfAllElements();
                break;
            case 2:
                System.out.println("2. Вывести каждый второй элемент массива в консоль.");
                //outputEverySecondItElement();
                break;
            case 3:
                System.out.println("3. Вывести все элементы массива в консоль в обратном порядке.");
               // outputAllElementsInReverseOrder();
                break;
            default:
                System.out.println("Не верно введен номер действия");
        }

    }
    public static int arrayFromConsole(int arrayLength) {

        int[] container = new int[arrayLength];
        Scanner texts = new Scanner(System.in);
        System.out.println("Введите числа массива \nДля раздления чисел использовать пробел");
        String[] text = texts.nextLine().split(" ");

        if (text.length < arrayLength) {
            System.out.println("Размер массива больше количесива введенных чисел");
        } else if (text.length > arrayLength) {
            System.out.println("Размер массива меньше количесива введенных чисел");
        } else {
            for (int i = 0; i < arrayLength; i++) {
                container[i] = Integer.parseInt(text[i]);
            }
            System.out.println(Arrays.toString(container));


        }
        return 0;
    }
   //public static void outputOfAllElements(int [] massiv){


   //}
   //public static void outputEverySecondItElement(int [] massiv){


   //}
   //public static void outputAllElementsInReverseOrder(int [] massiv){


   //}
}













