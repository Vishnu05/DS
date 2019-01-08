package Java.Basics.Loops;

public class LoopCheck {

    private static void check(int n) {

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                for (int k = 0; k < n; k++) {
                    // Running the o/p it makes sense hoe the for loop works
                    System.out.println("The iterators of 'i' is " + i + " then 'j' is " + j +" then k is "+k);

                    count += 1;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String args[]) {

        check(5);
        int count = 0;
        count += 1;
        System.out.println("Count check : " + count);

    }
}
