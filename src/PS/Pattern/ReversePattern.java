package PS.Pattern;

public class ReversePattern {

    public static void main(String args[]) {

        for (int i = 5; i >= 0; i--) {
            // System.out.println("it");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}

