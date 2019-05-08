package DataStructure_and_Algorithm.HackerRank.PS;

public class camelCase {

    public static void main(String[] args) {

        String str = "helloStrinG";

        char arr[] = str.toCharArray();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}