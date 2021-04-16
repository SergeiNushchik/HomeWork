package HomeWork_3.runners;

import HomeWork_3.calcs.additional.CalculatorWithCounterAutoComposite;
import HomeWork_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {
      //  4.1 + 15 * 7 + (28 / 5) ^ 2
        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        int f = 2;
        // a + b * c + (d / e) ^ f
        //plus - плюс
        //minus
        //dif - деление
        //add - умножение
        //ads - по модулю
        //pow - возведение в степень
        //sqrt - корень квадратный
        CalculatorWithCounterAutoComposite calculator1 = new CalculatorWithCounterAutoComposite( new CalculatorWithOperator());

        // этап 1. 15 * 7 = 105
        double result1 = calculator1.add(b,c) ;

        //этап 2.  28 / 5 = 5,6
        double result2 = calculator1.dif(d,e);

        //этап 3.  (28 / 5) ^ 2 = 31,36
        double result3 = calculator1.pow(result2,f);

        //этап 4.  4.1 + (15 * 7) = 109,1
        double result4 = calculator1.plus(a, result1);

        //этап 4.  4.1 + (15 * 7) + (28 / 5) ^ 2 = 140,46
        double result5 = calculator1.plus(result4, result3);

        System.out.println("Результат вычислениея примера :" + result5);
        System.out.println("Количество использования калькулятора: " + calculator1.getCountOperation());

    }

}
