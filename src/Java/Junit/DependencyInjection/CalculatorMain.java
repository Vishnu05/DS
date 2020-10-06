package Java.Junit.DependencyInjection;

import PS.Problems.Calculator;

public class CalculatorMain {


     CalculatorInterface calculatorInterface;

//    CalculatorMain(CalculatorInterface calculatorInterface) {
//        this.calculatorInterface = calculatorInterface;
//    }

    public CalculatorMain() {

    }

    public int add(int a, int b) {
        return calculatorInterface.add(a, b);
    }

    public static void main(String[] args) {

        CalculatorMain object = new CalculatorMain();

      //  CalculatorMain ob = new CalculatorMain(object.calculatorInterface);

        System.out.println(object.add(3,5));

    }
}
