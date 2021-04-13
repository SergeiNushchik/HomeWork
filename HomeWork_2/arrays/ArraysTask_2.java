package HomeWork_2.arrays;


import HomeWork_2.Utils.ArraysUtils;

import java.util.Scanner;


public class ArraysTask_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arrayLength = in.nextInt();

        int [] massiv = ArraysUtils.arrayFromConsole(arrayLength);


        outputOfAllElements(massiv, arrayLength);
        outputEverySecondItElement(massiv, arrayLength);
        outputAllElementsInReverseOrder(massiv, arrayLength);
    }


    /**
     * метод производит вывод всех элементов массива в консоль
     * @param massiv массив получаемый методом
     * @param length длина массива получаемого методом
     */
  public static void outputOfAllElements(int [] massiv, int length) {
      int i = 0;
      while (i < length ){
          System.out.print(massiv[i] + "\t");
          i++;
      }
      System.out.println();
  }

    /**
     * Метод производит вывод каждого второго элемента массива
     * @param massiv массив получаемый методом
     * @param lenght длина массива получаемого методом
     */
   public static void outputEverySecondItElement(int [] massiv, int lenght){
       for (int i = 0; i < lenght; i++) {
           if (i % 2 != 0){
               int a = massiv[i];
               System.out.println(massiv[i]);
           }
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














