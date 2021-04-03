package HomeWork_1;

import java.util.Objects;
import java.util.Scanner;

public class TheTask_5_1 {

    public static void main(String[] args) {
        System.out.println("---------Код который выполняет общее условие при помощи при помощи if");
        Scanner in = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = in.next();
        String a = "Вася";
        String b = "Анастасия";
        boolean c = false;
        if (Objects.equals(name, a)) {
            c = true;
            System.out.println("Привет! \nЯ тебя так долго ждал!");
        }

        if (Objects.equals(name, b)) {
            c = true;
            System.out.println("Я тебя так долго ждал!");
        }
        if (c == false) {
            System.out.println("Добрый день, а вы кто?");
        }
    }

}
