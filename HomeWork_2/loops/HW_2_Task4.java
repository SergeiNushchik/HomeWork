package HomeWork_2.loops;

public class HW_2_Task4 {
    public static void main(String[] args) {
        System.out.println("    __________Таблица умножения__________");

        int a = 4;
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 2; j <= 5; j++) {
                System.out.print(j + " x " + i + " = " + (i * j) + "\t");
            }
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 6; j <= 9; j++) {
                System.out.print(j + " x " + i + " = " + (i * j) + "\t");
            }


        }
    }
}








