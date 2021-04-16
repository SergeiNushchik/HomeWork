package HomeWork_3.calcs.additional;

import HomeWork_3.calcs.simple.CalculatorWithMathCopy;
import HomeWork_3.calcs.simple.CalculatorWithMathExtends;
import HomeWork_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {

    private CalculatorWithOperator calculator1;
    private CalculatorWithMathCopy calculator2;
    private CalculatorWithMathExtends calculator3;

    private long counter;

    private int var;

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calculator) {
        this.var = 1;
        this.calculator1 = calculator;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calculator) {
        this.var = 2;
        this.calculator2 = calculator;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calculator) {
        this.var = 3;
        this.calculator3 = calculator;

    }

    /**
     * Метод согласно обьявленного класса делегирует метод в соответствующий класс
     * @param a принимаемые параметр
     * @param b принимаемые параметр
     * @return цикла возвращает полученное значение
     * @return метода возвращает счетчик
     */
    public double plus(double a, double b){
        this.counter++;
        switch (var){
            case 1:
                return calculator1.plus(a,b);
            case 2:
                return calculator2.plus(a,b);
            case 3:
                return calculator3.plus(a,b);
        }
        return counter;
    }
    /**
     * Метод согласно обьявленного класса делегирует метод в соответствующий класс
     * @param a принимаемые параметр
     * @param b принимаемые параметр
     * @return цикла возвращает полученное значение
     * @return метода возвращает счетчик
     */
    public double minus(double a, double b){
        this.counter++;
        switch (var){
            case 1:
                return calculator1.minus(a,b);
            case 2:
                return calculator2.minus(a,b);
            case 3:
                return calculator3.minus(a,b);
        }
        return counter;
    }
    /**
     * Метод согласно обьявленного класса делегирует метод в соответствующий класс
     * @param a принимаемые параметр
     * @param b принимаемые параметр
     * @return цикла возвращает полученное значение
     * @return метода возвращает счетчик
     */
    public double dif(double a, double b){
        this.counter++;
        switch (var){
            case 1:
                return calculator1.dif(a,b);
            case 2:
                return calculator2.dif(a,b);
            case 3:
                return calculator3.dif(a,b);
        }
        return counter;
    }
    /**
     * Метод согласно обьявленного класса делегирует метод в соответствующий класс
     * @param a принимаемые параметр
     * @param b принимаемые параметр
     * @return цикла возвращает полученное значение
     * @return метода возвращает счетчик
     */
    public double add(double a, double b){
        this.counter++;
        switch (var){
            case 1:
                return calculator1.add(a,b);
            case 2:
                return calculator2.add(a,b);
            case 3:
                return calculator3.add(a,b);
        }
        return counter;
    }
    /**
     * Метод согласно обьявленного класса делегирует метод в соответствующий класс
     * @param a принимаемые параметр
     * @return цикла возвращает полученное значение
     * @return метода возвращает счетчик
     */
    public double ads(double a) {
        this.counter++;
        switch (var) {
            case 1:
                return calculator1.ads(a);
            case 2:
                return calculator2.ads(a);
            case 3:
                return calculator3.ads(a);
        }
        return counter;
    }
    /**
     * Метод согласно обьявленного класса делегирует метод в соответствующий класс
     * @param a принимаемые параметр
     * @param b принимаемые параметр
     * @return цикла возвращает полученное значение
     * @return метода возвращает счетчик
     */
    public double pow(double a, int b){
        this.counter++;
        switch (var){
            case 1:
                return calculator1.pow(a, b);
            case 2:
                return calculator2.pow(a, b);
            case 3:
                return calculator3.pow(a, b);
        }
        return counter;
    }
    /**
     * Метод согласно обьявленного класса делегирует метод в соответствующий класс
     * @param a принимаемые параметр
     * @return цикла возвращает полученное значение
     * @return метода возвращает счетчик
     */
    public double sqrt(double a) {
        this.counter++;
        switch (var){
            case 1:
                return calculator1.sqrt(a);
            case 2:
                return calculator2.sqrt(a);
            case 3:
                return calculator3.sqrt(a);
        }
        return counter;
    }

    /**
     * Метод вывода колличества использования колькулятораю
     * @return возвращает колиичесто использования
     */
    public   long getCountOperation(){
        return this.counter;
    }
}


