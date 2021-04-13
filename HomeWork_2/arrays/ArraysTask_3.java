package HomeWork_2.arrays;


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
        SumOfEvenPositive(massiv,a);
        MaximumOfEvenIndexedArrayElements(massiv,a);
        ArrayElementsThatAreLessThanTheArithmeticMean(massiv,a);
        TwoSmallest(massiv,a);
        RemoveItemsFromAnInterval(massiv,a);
        SumOfArrayDigits(massiv,a);


       // System.out.println("Выберите необходимое действие");
       //
       // System.out.println("Сумма четных положительных элементов массива");
       //
       // System.out.println("Максимальный из элементов массива с четными индексами");
       //
       // System.out.println("Элементы массива, которые меньше среднего арифметического");
       //
       // System.out.println("Найти два наименьших (минимальных) элемента массива");
       //
       // System.out.println("Сжать массив, удалив элементы, принадлежащие интервалу");
       //
       // System.out.println("Сумма цифр массива");


    }
    public static void SumOfEvenPositive(int [] massiv, int length){
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

    public static void MaximumOfEvenIndexedArrayElements (int [] massiv, int length){
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

    public static void ArrayElementsThatAreLessThanTheArithmeticMean(int [] massiv, int length){
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
    public static void TwoSmallest(int [] massiv, int length) {
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

    public static void RemoveItemsFromAnInterval(int [] massiv, int length){
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
    public static void SumOfArrayDigits(int [] massiv, int length){
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

