package HomeWork_1;

import java.util.Objects;
import java.util.Scanner;

public class TheTask_5_3 {

    public static void main(String[] args) {
        System.out.println("---------Код который выполняет общее условие при помощи при помощи switch");
        Scanner in = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = in.next();
        switch (name){
            case "Вася":
                System.out.println("Привет! \nЯ тебя так долго ждал!");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал!");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}