package Java.Advanced.Exceptions;

public class Custo {

    void test(int a) {
        if (a < 18) {
            try {
                throw new ArithmeticException(" Hey your age is not cool");
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String args[]) {

        //Custom ob = new Custom();
       // ob.test(5);
    }
}

