package lv.javaguru.demo.lecture1to3;

public class MainOtrs {
    public static void main(String[] args) {
        CalculatorImproved calculator = new CalculatorImproved();

        System.out.println("SUM: " + calculator.sum(17, 53));
        System.out.println("SUB: " + calculator.subtract(17, 53));
        System.out.println("MUL: " + calculator.multiple(17, 53));
        System.out.println("DIV: " + calculator.division(150, 53));

    }}
