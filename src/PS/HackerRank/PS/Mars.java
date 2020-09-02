package PS.HackerRank.PS;

import java.io.*;
import java.util.*;

public class Mars {

    // Complete the marsExploration function below.
    static int marsExploration(String s) {

        String msg = "SOS";
        int len = s.length() / 3;
        int count = 0;

        for (int i = 0; i < len / 2; i++) {
            msg += msg;
        }

        char arr[] = s.toCharArray();
        char arr1[] = msg.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr1[i]) {
                count += 1;
            }
        }


        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

