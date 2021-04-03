package HomeWork_1;

public class Operators_1 {

    public static void main(String[] args) {

        Operations1(); // 5 + 2 / 8
        Operations2(); // (5 + 2) / 8
        Operations3(); // (5 + 2++) / 8

    }
    public static void Operations1(){
        int a = 42; // 0b00101010
        int b = 15; // 0b00001111
        System.out.println( "-----------------------Задание № 1.2-------------------------------" );
        System.out.println("-------------Побитовый AND:");
        System.out.println("Результат использования оператора AND: " + (a & b)); //0b00001010
        System.out.println("-------------Побитовый OR:");
        System.out.println("Результат опеератора OR: " + (a | b)); //0b00101111
        System.out.println("-------------Побитовый XOR:");
        System.out.println("Результат: " + (a ^ b)); //0b00100101
        System.out.println("-------------Побитовые сдвиги:");
        System.out.println("Результат сдвига в право числа 42: " + (a>>1)); // 0b00010101
        System.out.println("Результат сдвига в лево числа 42: " + (a<<1)); // 0b01010100
        System.out.println("Результат сдвига в право числа 15: " + (b>>1)); // 0b00000111
        System.out.println("Результат сдвига в лево числа 15: " + (b<<1)); // 0b00011110
        System.out.println("-------------Побитовые NOT:");
        System.out.println("число 42 в двоичном коде:                "+ Integer.toBinaryString(a));
        System.out.println("Результат использования оператора NOT: " + Integer.toBinaryString(~a).substring(24,32)); //0b11010101
        System.out.println("число 15 в двоичном коде:                  "+ Integer.toBinaryString(b));
        System.out.println("Результат использования оператора NOT: " + Integer.toBinaryString(~b).substring(24,32)); // 0b11110000
    }
    public static void Operations2(){
        byte a = -42; // 00101010
        byte b = -15; // 00001111
        System.out.println( "-----------------------Задание № 1.3-------------------------------" );
        System.out.println("-------------Побитовый AND:");
        System.out.println("Результат использования оператора AND: " + (a & b) + "; двоичная система " + Integer.toBinaryString(b << 1).substring(24, 32)); //результат: -48; двоичный код: 11100010
        System.out.println("-------------Побитовый OR:");
        System.out.println("Результат опеератора OR:" + (a | b) + "; двоичная система " + Integer.toBinaryString(a | b).substring(24, 32)); //результат: -9; двоичный код: 11110111
        System.out.println("-------------Побитовый XOR:");
        System.out.println("Результат: " + (a ^ b)); //результат: 39; двоичный код: 101110
        System.out.println("-------------Побитовые сдвиги:");
        System.out.println("Результат сдвига в право числа -42: " + (a >> 1) + "; двоичная система " + Integer.toBinaryString(a >> 1).substring(24, 32)); //результат: -21; 11101011
        System.out.println("Результат сдвига в лево числа -42: " + (a << 1) + "; двоичная система " + Integer.toBinaryString(a << 1).substring(24, 32)); // результат: -84; 10101100
        System.out.println("Результат сдвига в право числа -15: " + (b >> 1) + "; двоичная система " + Integer.toBinaryString(b >> 1).substring(24, 32)); // результат: -8; 11111000
        System.out.println("Результат сдвига в лево числа -15: " + (b << 1) + "; двоичная система " + Integer.toBinaryString(b << 1).substring(24, 32)); // результат: -30; 11100010
        System.out.println("-------------Побитовые NOT:");
        System.out.println("число -42 в двоичном коде:                " + Integer.toBinaryString(a).substring(24, 32)); // 11010110
        System.out.println("Результат использования оператора NOT: " + Integer.toBinaryString(~a)); //  101001
        System.out.println("число -15 в двоичном коде:                  " + Integer.toBinaryString(b).substring(24, 32));  // 11110001
        System.out.println("Результат использования оператора NOT: " + Integer.toBinaryString(~b)); //  1110
    }
    public static void Operations3(){

    }

    }
