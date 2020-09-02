package PS.Programs;

public class Palindrome2 {

    /*Naive program to write like this*/
    public static void main(String args[]) {

        String check = "1213";

        StringBuilder ob = new StringBuilder();
        ob = ob.append(check);

        ob = ob.reverse();
        System.out.println(ob);
        // char a1[] = check.toCharArray();
        String a = ob.toString();
        //char a2[] = a.toCharArray();

        if (check.equals(a)) {
            System.out.println("Palindrome :" + ob);
        } else {
            System.out.println("Not palindrome :" + ob);
        }
    }
}
