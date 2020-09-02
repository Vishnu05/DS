package PS.HackerRank.Days_30;

import java.util.Scanner;

public class fact {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        int n = ob.nextInt();
        int arr[] = new int[n];

        for (int j = 0; j < arr.length; j++) {
            int a = 10;

            arr[j] = ob.nextInt();

            boolean temp = false;
            if(arr[j]==1){
                temp=true;
            }
            for (int i = 2; i < arr[j]; i++) {
                if (arr[j] % i == 0) {
                    temp = true;
                }
            }
            if (temp) {
                System.out.println("Not prime");
            } else {
                System.out.println("Prime");
            }

        }
    }

}
