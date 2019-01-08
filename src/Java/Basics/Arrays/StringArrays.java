package Java.Basics.Arrays;

public class StringArrays {
    public static void main(String args[]) {

        String[] vishnu = {"Java", "JS", "UI"};

        for (String a : vishnu) {
            System.out.println(a);
        }
        int[] b = {1, 5, 8}; //For each loop
        for (int a : b) {
            System.out.println(a);
        }
        for (int a = 0; a < vishnu.length; a++) {
            System.out.println(vishnu[a]);
        }


    }
}
