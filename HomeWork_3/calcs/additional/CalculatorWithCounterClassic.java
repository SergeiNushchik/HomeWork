package HomeWork_3.calcs.additional;

import HomeWork_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    long sthet = 0;

    public void incrementCountOperation() {
        this.sthet++;
    }
    public long  getCountOperation(){
        return this.sthet;
    }

}
