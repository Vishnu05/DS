package Java.Basics.Learning;



import java.util.Scanner;

public class TernaryOperator {

    /*Ternary operators are like mature if else statement fist value is if and second one is else
     * it is for only single statement block level does not work in ternary operator, block also can be done not sure? */

    /* result = condition ? if : else; it should return the valid type */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        boolean foo;

        foo = a > 10 ? true : false;

        /*even numbers get added and odd one will be subtracted*/

        int count;
        for (int i = 0; i < 10; i++) {

            count = (i % 2 == 0) ? (count = 100) : (count = 99);
            System.out.println(count);
        }
        System.out.println(foo);


    }
}
