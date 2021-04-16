package HomeWork_3.calcs.simple;

import HomeWork_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
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
