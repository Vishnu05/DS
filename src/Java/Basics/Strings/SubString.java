package Java.Basics.Strings;

public class SubString {

    static public String subString(String s, String s1) {
        char arr[] = s.toCharArray();
        char arr1[] = s1.toCharArray();
        int count = 0;
        int temp = s1.length();
        String res;

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (arr1[i] == arr[j]) {
                    count += 1;
                }
            }
        }
        if (count == temp) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {

        String s = "vishnu";
        String s1 = "sh,";
        System.out.println(subString(s,s1));


    }
}
