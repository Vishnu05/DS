package PS.HackerRank;

import java.util.Scanner;

public class ViralAdvertising {

    /*Honestly it took me around 5 months to solve this problem understand the question
    * it is pretty much easy need to understand the question*/
    static Scanner in = new Scanner(System.in);

    public static void main (String args[]) {

        int n = in.nextInt();
        int people = 5;
        int liked = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            /*Initial people will be 5 from that it will divided into 2 */
            count = people / 2;
            /*from that divided one it will added to liked*/
            liked += count;
            /*liked people will exactly send or share with other 3 people this goes on forever */
            people = count * 3;
        }
        /*at the end we must calculate how many people liked the advertisement*/
        System.out.println(liked);
    }
}
