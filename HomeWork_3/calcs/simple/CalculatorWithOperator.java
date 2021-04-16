package HomeWork_3.calcs.simple;

import HomeWork_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    public double plus(double a, double b){
        return a + b;
    }
    public double minus(double a, double b){
        return a - b;
    }
    public double dif(double a, double b){
        return a / b;
    }
    public double add(double a, double b){
        return a * b;
    }
    public double ads(double a) {
        if (a < 0) {
            return a * -1;
        } else {
            return a;
        }
    }
    public double pow(double a, int b){
       double result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;

        }
        return result;
    }
    public double sqrt(double a) {
            return Math.sqrt(a);
    }
}


