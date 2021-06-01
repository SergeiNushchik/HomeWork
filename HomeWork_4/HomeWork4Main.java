package HomeWork_4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int w = a / 7;


        toWeek(a);

    }
    public static String toWeek(int day) {
        
        String result = new String();
        String week;
        if ( 2 <= day && day <=4){
            result = day +  " недели";
            System.out.println(result);
        } else if (day == 1 ){
            result = day +  " неделя";
            System.out.println(result);
        }else {
            result = day +  " недель";
            System.out.println(result);
        }
        return result;
    }
}
