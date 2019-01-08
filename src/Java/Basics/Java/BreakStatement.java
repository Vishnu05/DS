package Java.Basics.Java;

public class BreakStatement {

    static int breakSt() {

        for (int i = 0; i < 10; i++) {

            if (4 == i) {
                break;
            }
            System.out.println(" Count " + i);
        }
        return 0;
    }

    public static void main(String[] args) {

        breakSt();
    }
}
