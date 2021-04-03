package HomeWork_1;

import java.util.Scanner;

public class TheTask_3 {

    public static void main(String[] args) {

        System.out.println(sleepIn(true,false)); // Пора идти на работу
        System.out.println(sleepIn(false,true)); // Можем спать дальше
    }
     static String sleepIn(boolean weekday, boolean vacation){

        if(!weekday || vacation )
        return "Можем спать дальше";
     else {
            return "Пора идти на работу";
        }
    }
}