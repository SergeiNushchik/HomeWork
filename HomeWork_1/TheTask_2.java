package HomeWork_1;

public class Operators_2 {

    public static void main(String[] args) {

        Example1(); // 5 + 2 / 8
        Example2(); // (5 + 2) / 8
        Example3(); // (5 + 2++) / 8
        Example4(); // (5 + 2++) / --8
        Example5(); // (5 * 2 >> 2++) / --8
        Example6(); // (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8
        Example7(); // (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8
        Example8(); // 6 - 2 > 3 && 12 * 12 <= 119
        Example9(); // true && false
    }
    public static void Example1(){
        int a = 5;
        int b = 2;
        int c = 8;
        // 1 этап: 2 / 8;
        // 2 этап 5 + 0,25
        // ответ должен получиться 5,25;
        System.out.println(a+ b / c);
    }
    public static void Example2(){
        int a = 5;
        int b = 2;
        int c = 8;
        // 1 этап: 5 + 2
        // ; 2 этап 7 / 8
        // ответ должен получиться 0,875
        System.out.println((a + b) / c);
    }
    public static void Example3(){
        int a = 5;
        int b = 2;
        int c = 8;
        // 1 этап: 5 + 2;
        // 2 этап: переменная b увеличина на 1;
        // 3 этап: 7 / 8;
        // ответ должен получиться 0,875;
        System.out.println((a + b++) / c);
    }
    public static void Example4(){
        int a = 5;
        int b = 2;
        int c = 8;
        // 1 этап: 5 + 2;
        // 2 этап: переменная b увеличина на 1;
        // 3 этап: переменная с уменьшина на 1;
        // 3 этап: 7 / 7
        // ответ должен получиться 1;
        System.out.println((a + b++) / --c);
    }
    public static void Example5(){
        int a = 5;
        int b = 2;
        int c = 8;
        // 1 этап: 5 * 2 = 10;
        // 2 этап: переменная b увеличина на 1
        // 3 этап: число 10 сдвиг в право на 2 знака: результа 2
        // 3 этап: переменная с уменьшина на 1
        // 3 этап: 2 / 7
        // ответ должен получиться 0,286;
        System.out.println((a * 2 >> b++) / --c);
    }
    public static void Example6(){
        int a = 5;
        int b = 2;
        int c = 8;
        // 1 этап: 22 * 2 = 44;
        // 2 этап: число 44 сдвиг в право на 2 знака: результа 11;
        // 2 этап: переменная b увеличина на 1
        // 3 этап: 5 + 7 < 20 следовательно результат операций выпольнянемых в круглых скобках равен 11;
        // 3 этап: переменная с уменьшина на 1
        // 3 этап: 11 / 7
        // ответ должен получиться 1,57;
        System.out.println((a + 7 > 20 ? 68 : 22 * 2>> b++) / --c);
    }
    public static void Example7(){
        int a = 5;
        int b = 2;
        int c = 8;
        // Допущена ошибка в заполнени теернарного оператора. "68 >= 68" не допустимо!
        System.out.println("Допущена ошибка в заполнени теернарного оператора. 68 >= 68 не допустимо!");
    }
    public static void Example8(){
        boolean d = 6-2 > 3 && 12*12<=119;
        // 1 этап: 6-2= 4; 4 >3   true
        // 2 этап: 12 * 12 = 144; 144 <= 119 false
        // Результат выполнения операнда "false"
        System.out.println(d);
    }
    public static void Example9(){
        boolean d = true && false;
        // Результат выполнения операнда "false"
        System.out.println(d);
    }
}