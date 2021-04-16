package HomeWork_3.calcs.additional;

import HomeWork_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    public long sum;

    public double plus(double a, double b){
        this.sum++;
        return  super.plus( a, b);
    }
    public double minus(double a, double b){
        this.sum++;
        return super.minus(a,b);
    }
    public double dif(double a, double b){
        this.sum++;
        return super.dif(a,b);
    }
    public double add(double a, double b){
        this.sum++;
        return super.add(a,b);
    }
    public double ads(double a) {
        this.sum++;
        return super.ads(a);
    }
    public double pow(double a, int b){
        this.sum++;
        return super.pow(a , b);
    }
    public double sqrt(double a) {
        this.sum++;
        return super.sqrt(a);
    }
    public long getSum(){
        return this.sum;
    }

}
