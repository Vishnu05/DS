package Java.Prob.Probs;

public class Calc {

    static public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {   //package have to specified
        return a - b;
    }

    public int multiply(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return a * b;
    }

    public int divsion(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        add(1, 8);

        Calc ob = new Calc();
        ob.divsion(12, 2);

    }
}
