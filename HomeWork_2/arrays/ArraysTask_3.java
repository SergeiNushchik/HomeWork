package HomeWork_2.arrays;


import HomeWork_2.Utils.ArraysUtils;

import java.util.Arrays;
import java.util.Scanner;



public class ArraysTask_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Long massiv");
        int a = in.nextInt();
        System.out.println("Max massiv");
        int b = in.nextInt();

        int [] massiv = ArraysUtils.arrayRandom(a,b);
        System.out.println();
        sumOfEvenPositive(massiv,a);
        maximumOfEvenIndexedArrayElements(massiv,a);
        arrayElementsThatAreLessThanTheArithmeticMean(massiv,a);
        twoSmallest(massiv,a);
        removeItemsFromAnInterval(massiv,a);
        sumOfArrayDigits(massiv,a);

    }
    public static void sumOfEvenPositive(int [] massiv, int length){
        System.out.println("2.4.1. Сумма четных положительных элементов массива");
        int result = 0;
        for (int i = 0; i < length; i++) {
            if (massiv[i] % 2 == 0 ){
                result = result + massiv[i];
            } else {}
        }
        System.out.println("Сумма четных положительных элементов массива = " + result);
        System.out.println();
    }

    /**
     *  Метод производит перебор полученного массива на наличие четных чисел и выбирает из них максимальное значение
     * @param massiv полученный массив
     * @param length длина полученного массива
     */
    public static void maximumOfEvenIndexedArrayElements (int [] massiv, int length){
        System.out.println("2.4.2. Максимальный из элементов массива с четными индексами");
        int max = 0;
        for (int i = 0; i < length; i++) {
            if (massiv[i] % 2 == 0){
                if (massiv[i] >= max) {
                    max = massiv[i];
                }else{}
            }else {}

        }
        System.out.println(max);
        System.out.println();
    }

    /**+
     * Метод производит перебор полученного массива в поисках чисел меньше среднего арифметического самого массива
     * @param massiv полученный массив
     * @param length длина полученного массива
     */
    public static void arrayElementsThatAreLessThanTheArithmeticMean(int [] massiv, int length){
        System.out.println("2.4.3. Элементы массива, которые меньше среднего арифметического");
        int sum = 0;
        for (int i = 0; i <length ; i++) {
            sum = sum + massiv[i];
        }
        int arithmetic = sum / length;
        for (int i = 0; i < length; i++) {
            if ( massiv[i] < arithmetic){
                System.out.print( "\t" + massiv[i]);
            }else{}
        } System.out.println();

    }

    /**
     * Метод производит поиск в полученном масиве двух наименьших значвение
     * @param massiv полученный массив
     * @param length длина полученного массива
     */
    public static void twoSmallest(int [] massiv, int length) {
        System.out.println("2.4.4. Найти два наименьших (минимальных) элемента массива");
        int min = massiv[0];
        int min2 = massiv[0];
        for (int i = 0; i < length; i++) {
            if (massiv[i] < min) {
                min = massiv[i];
            }
            for (int j = 0; j < length; j++) {
                if (massiv[j] < min2 & min< massiv[j]){
                    min2 = massiv[j];
                }
            }
        }
        System.out.println("Первый минимальный элемент " + min);
        System.out.println("Второй минимальный элемент " + min2);
    }

    /**
     * метод производит поиск чисел входдящих в указанный интервал и удаляет их (заменяя на ноль)
     * @param massiv полученный массив
     * @param length длина полученного массива
     */
    public static void removeItemsFromAnInterval(int [] massiv, int length){
        Scanner in = new Scanner(System.in);
        System.out.println("2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу");
        System.out.println("Введите начало инетвала ");
        int min = in.nextInt();
        System.out.println("Введите конец инетвала ");
        int max = in.nextInt();
        System.out.println("Числа в интервале от " + min +  " до " + max + " будут удалены!!!");
        for (int i = 0; i < length; i++) {
            if (min <= massiv[i] & massiv[i] <= max){
                System.out.println(massiv[i]);
                massiv[i] = 0;
                System.out.println(massiv[i]);
            }
        }
        System.out.println(Arrays.toString(massiv));
    }

    /**
     * Метод производит сложение всех чисел массива
     * @param massiv полученный массив
     * @param length длина полученного массива
     */
    public static void sumOfArrayDigits(int [] massiv, int length){
        System.out.println("2.4.6. Сумма цифр массива");
        int result = 0;
            for (int i : massiv){
                int a = i;
                while(a > 0){
                    result = result + (a % 10);
                    System.out.println(result);
                    a /= 10;
                    System.out.println(a);
                }
            }
    }
}

