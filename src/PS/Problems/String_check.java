package PS.Problems;

public class String_check {

    public static void main(String ars[]) {

        String toCheck = "aa";
        char arr[] = toCheck.toCharArray();

        int j = 1;
        int count = 0;
        for (int i = 0; i < toCheck.length() && j < toCheck.length(); i++) { // Refactored

            if (arr[i] == arr[j]) {
                count += 1;
            }

            j++;
//            if (j != toCheck.length()-1) {
//                j++;
//            }
        }
      //  count = count - 1;
        System.out.println(count);
    }
}
