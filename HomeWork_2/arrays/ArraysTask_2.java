package HomeWork_2.arrays;


import java.util.Arrays;
import java.util.Scanner;


public class ArraysTask_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arrayLength = in.nextInt();

        int [] massiv = ArraysUtils.arrayFromConsole(arrayLength);

        System.out.println(Arrays.toString(massiv));

        System.out.println("Выберите действия которые необходимо произвести с полученным масивом:");
        System.out.println("1. Вывести все элементы в консоль.");
        System.out.println("2. Вывести каждый второй элемент массива в консоль.");
        System.out.println("3. Вывести все элементы массива в консоль в обратном порядке.");
        int varr = in.nextInt();
        switch (varr){
            case 1:
                outputOfAllElements(massiv, arrayLength);
                break;
            case 2:
                outputEverySecondItElement(massiv, arrayLength);
                break;
            case 3:
               outputAllElementsInReverseOrder(massiv, arrayLength);
                break;
            default:
                System.out.println("Не верно введен номер действия");
        }
    }

    /**
     * метод производит вывод всех элементов массива в консоль
     * @param massiv массив получаемый методом
     * @param length длина массива получаемого методом
     */
   public static void outputOfAllElements(int [] massiv, int length) {
       for (int i = 0; i < length - 1; i++) {
           System.out.print(massiv[i] + "\t");
       }
   }

    /**
     * Метод производит вывод каждого второго элемента массива
     * @param massiv массив получаемый методом
     * @param lenght длина массива получаемого методом
     */
   public static void outputEverySecondItElement(int [] massiv, int lenght){
       for (int i = 2; i < lenght - 1 ; i++) {
           if (i % 2 == 0){
               System.out.println(massiv[i]);
           } else { }
       }

   }

    /**
     * Метод производит вывод всех элементов массива в обратном порядке
     * @param massiv массив получаемый методом
     * @param length длина массива получаемого методом
     */
   public static void outputAllElementsInReverseOrder(int [] massiv, int length){

       for (int i = 1; i <= length ; i++) {
          int a = length - i;

           System.out.print(massiv[a] + "\t");

       }
   }
}














