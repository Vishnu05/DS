package Java.Junit.DependencyInjection;

public class CalculatorImplements implements CalculatorInterface {

    public int add(int a, int b) {
        return a + b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int[] arrays() {

        int arr[] = {1, 2};
        return arr;
    }
}
