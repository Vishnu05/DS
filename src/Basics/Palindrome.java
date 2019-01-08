import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        String a;
        Scanner ob = new Scanner(System.in);
        System.out.println("Type the String to check whether it is Palindrome or NOT");
        a = ob.next();

        String temp = a;

        temp = temp;
        if (temp == a) {
            System.out.println("The Given string is  Palindrome");

        } else {
            System.out.println("The given string is not palindrome");
        }
    }
}
