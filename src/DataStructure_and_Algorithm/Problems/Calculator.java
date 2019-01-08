package DataStructure_and_Algorithm.Problems;


public class Calculator {

    public int add(int a, int b) {

        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {

        if (a == 0 || b == 0) {
            return 1;
        }
        return a * b;
    }

    public int divide(int a, int b) {

        if (a == 0 || b == 0) {
            return 1;
        }
        return a / b;
    }


    public static void main(String args[]) {

        Calculator obj = new Calculator();
        System.out.println(obj.divide(1, 0));
    }
}
