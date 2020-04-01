package Java.Prob.Probs;

public class JavaScript_loops {

    public static void main(String[] args) {

        String s = "javascriptloops";
        String v = "aeiou";

        char ar[] = s.toCharArray();
        char arr[] = v.toCharArray();

                


        for (int i = 0; i < arr.length; i++) {
            for (int k = i; k < s.length(); k++) {

                if (arr[i] == ar[k]) {
                    System.out.println(ar[k]);
                    ar[k] = ' ';
                }
            }
        }

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != ' ') {
                System.out.println(ar[i]);
            }
        }


    }
}
