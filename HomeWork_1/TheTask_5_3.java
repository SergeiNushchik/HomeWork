package HomeWork_1;

import java.util.Objects;
import java.util.Scanner;

public class TheTask_5 {

    public static void main(String[] args) {
        Variant1(); // Код который выполняет общее условие при помощи при помощи if
        Variant2(); // Код который выполняет общее условие при помощи при помощи if else if
        Variant3(); // Код который выполняет общее условие при помощи при помощи switch
    }
    public static void Variant1(){
        System.out.println("---------Код который выполняет общее условие при помощи при помощи if");
        Scanner in = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = in.next();
        String a = "Вася";
        String b = "Анастасия";
        boolean c = false;
        if (Objects.equals(name, a)) {
            c = true;
            System.out.println("Привет! \nЯ тебя так долго ждал");
        }

        if (Objects.equals(name, b)) {
            c = true;
            System.out.println("Я тебя так долго ждал");
        }
        if (c == false) {
            System.out.println("Добрый день, а вы кто?");
        }
    }
    public static void Variant2(){
        System.out.println("---------Код который выполняет общее условие при помощи if else if");
        Scanner in = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = in.next();
        String a = "Вася";
        String b = "Анастасия";
        if (Objects.equals(name, a)) {
            System.out.println("Привет! \nЯ тебя так долго ждал");
        } else if (Objects.equals(name, b)) {
            System.out.println("Я тебя так долго ждал");
        } else  {
            System.out.println("Добрый день, а вы кто?");
        }
    }
    public static void Variant3(){
        System.out.println("---------Код который выполняет общее условие при помощи при помощи switch");
        Scanner in = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = in.next();
        switch (name){
            case "Вася":
                System.out.println("Привет! \nЯ тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");

        }
    }

    }