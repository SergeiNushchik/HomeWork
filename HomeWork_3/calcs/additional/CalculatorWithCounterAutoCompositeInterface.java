package HomeWork_3.calcs.additional;

import HomeWork_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoCompositeInterface implements ICalculator {
    private ICalculator calculator;

    private long counter;

    public CalculatorWithCounterAutoCompositeInterface(ICalculator calculator){
        this.calculator = calculator;

    }

    @Override
    public double plus(double a, double b) {
        this.counter++;
        return calculator.plus(a, b);
    }

    @Override
    public double minus(double a, double b) {
        this.counter++;
        return calculator.minus(a, b);
    }

    @Override
    public double dif(double a, double b) {
        this.counter++;
        return calculator.dif(a, b);
    }

    @Override
    public double add(double a, double b) {
        this.counter++;
        return calculator.add(a, b);
    }

    @Override
    public double ads(double a) {
        this.counter++;
        return calculator.ads(a);
    }

    @Override
    public double pow(double a, int b) {
        this.counter++;
        return calculator.pow(a, b);
    }

    @Override
    public double sqrt(double a) {
        this.counter++;
        return calculator.sqrt(a);
    }
    public   long getCountOperation(){
        return this.counter;
    }
}
