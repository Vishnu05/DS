package PS.HackerRank.PS;

import java.util.Scanner;

public class UtopianTree2 {

    static int tree(int n) {

        int count = 1;
        /* at each year the height will in 2 growth, spring it will double and in summer height is increased by one
        evens are added 1 and odds are doubled  */
        for (int i = 0; i <= n; i++) {
            if (i > 0) {
                if (i % 2 != 0) {
                    count += count;
                } else {
                    count++;
                }
            }
        }
        return count;
    }

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int temp = scan.nextInt();
            System.out.println(tree(temp));
        }
    }
}
