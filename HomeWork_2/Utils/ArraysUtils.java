package HomeWork_2.Utils;


import java.util.Arrays;
import java.util.Scanner;

public class ArraysUtils {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arrayLength = in.nextInt();

        System.out.println("Выберите вариант заполнения массива:");
        System.out.println("___1 - Заполнение массива будет производиться с клавиатуры самостоятельно");
        System.out.println("___2 - Заполнение массива произвести автоматически (Потребуеться ввести максимальное допустимое число) ");
        int varr = in.nextInt();

        if (varr == 1) {
            arrayFromConsole(arrayLength);
            int [] massiv = arrayFromConsole(arrayLength);

        } else if (varr == 2) {
            System.out.println("Введите максимальное число");
            int max = in.nextInt();
            arrayRandom(arrayLength, max);

        } else {
            System.out.println("Не верно введены параметры!");
        }

    }

    /**
     * Метод производит заполнение массива при помощи ввода данных с консоли
     * @param arrayLength длиня массива
     * @return возращает массив
     */
    public static int [] arrayFromConsole(int arrayLength) {

        int[] container = new int[arrayLength];
        Scanner texts = new Scanner(System.in);
        System.out.println("Введите числа массива \nДля раздления чисел использовать пробел");
        String[] text = texts.nextLine().split(" ");

            for (int i = 0; i < arrayLength; i++) {
                container[i] = Integer.parseInt(text[i]);
            }
        System.out.println("Полученный массив: " + Arrays.toString(container));
        return container;
    }


    /**
     * Метод производит заполнение массива в автоматическом режиме при помощи фугкции Math.random
     * @param size длина массива
     * @param maxValueExclusion максимальное допустимое чило в массиве
     * @return возращает массив
     */
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] container = new int[size];
        for (int i = 0; i < size; i++) {
            int random = (int) (Math.random()*maxValueExclusion);
            container[i] = random;
        }
        System.out.println("Полученный массив: " + Arrays.toString(container));

        return container;
    }
}










