package HomeWork_1;

import java.util.Objects;
import java.util.Scanner;

public class TheTask_5_2 {

    public static void main(String[] args) {
        System.out.println("---------Код который выполняет общее условие при помощи if else if");
        Scanner in = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = in.next();
        String a = "Вася";
        String b = "Анастасия";
        if (Objects.equals(name, a)) {
            System.out.println("Привет! \nЯ тебя так долго ждал!");
        } else if (Objects.equals(name, b)) {
            System.out.println("Я тебя так долго ждал!");
        } else  {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
