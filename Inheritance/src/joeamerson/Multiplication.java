package joeamerson;

public class Multiplication implements CalculationRule {
    private int result;
    private final int number1;
    private final int number2;


    public Multiplication(int number1 , int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber() {
        return result;
    }

    public void setNumber() {
        result = number1 * number2;
    }
}
