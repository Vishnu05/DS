package Java.Junit.Class;

public class Calculator {

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


    public String TDD(String str) {
        return str;
    }

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        System.out.println(cal.add(1, 2));
    }
}
