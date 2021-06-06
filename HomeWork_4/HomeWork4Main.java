package HomeWork_4;

import java.text.FieldPosition;
import java.text.Format;

import java.util.Formatter;
import java.util.Scanner;

import static HomeWork_4.declination.*;


public class HomeWork4Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       long millsec = in.nextLong();
       toHoursMinuteSecondMillisecond(millsec,false);
        toHoursMinuteSecondMillisecond(7789001, true);
        toHoursMinuteSecondMillisecond(7789001, false);

      // //Ввод данных для задания №3
      // Scanner scanner = new Scanner(System.in);
      // System.out.println("Введите количество дней");
      // int a = scanner.nextInt();
      // // Запуск задания №3
      // toWeek(a);

    }

    /**
     * Метод прозводящий  перещет дней в недели
     * @param day полученое количество дней
     * @return result  строка типа String с полученным результатом для вывовода на экран
     */
    public static String toWeek(int day) {

        int week = day / 7;

        String result = new String();

        if (2 <= week && week <=4){
            result = week +  " недели";
            System.out.println(result);
        } else if (week == 1){
            result = week +  " неделя";
            System.out.println(result);
        }else {
            result = week +  " недель";
            System.out.println(result);
        }
        return result;

    }


    /**
     * Метод конвертируют переданные миллисекунды в количество часов, минут, секунд и миллисекунд.
     * @param millisecond
     * @param shortFormat
     * @return
     */
    public static String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat){
        String result = new String();
            int hose = (int) (millisecond / 3600000);
            int mill1 = (int) (millisecond % 3600000);
            String hoses = String.format("%02d", hose);

            int min = (int) (mill1 / 60000);
            int mill2 = (int) (mill1 % 60000);
            String mins = String.format("%02d", min);

            int second = (int) (mill2 / 1000);
            int mill3 = (int) (mill2 % 1000);
            String seconds = String.format("%02d", second);
            String mills = String.format("%03d", mill3);




        if (shortFormat == true){
            result += hoses + ":" + mins + ":" + seconds + ":" + mills;
            System.out.println(result);

        }else {
            String hosess = sortHoses(hose);
            String minss = sortMin(min);
            String secondss = sortSecond(second);
            String mill3ss = sortMills(mill3);

            result += hoses + " " + hosess + " " + mins + " " + minss + " " + seconds + " " + secondss + " " + mills  + " " + mill3ss;
            System.out.println(result);
        }
        return result;
    }
}
