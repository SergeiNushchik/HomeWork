package HomeWork_3.calcs.simple;

import HomeWork_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

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
        return Math.abs(a);
    }
    public double pow(double a, int b){
     return Math.pow(a , b);
    }
    public double sqrt(double a) {
            return Math.sqrt(a);
    }
}


