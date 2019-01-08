package Java.Basics.Prob;

public class Ch {

    String chem = "Ce6H6";
    // String is converted to char array
    char[] arr = chem.toCharArray();
    char temp = ' ', temp1 = ' ';
    int len = chem.length();

    char alphabet() {
        for (int i = 0; i < len; i++) {

            if (Character.isAlphabetic(arr[i]))
                return temp = arr[i];
        }
        return temp;
    }

    char digit() {
        for (int i = 0; i < len; i++) {
            if (Character.isDigit(arr[i])) {
               return temp1 = arr[i];
            }
        }
        return temp;
    }


    public static void main(String arg[]) {

        Ch obj = new Ch();
        //  obj.print();

        System.out.println(obj.alphabet() + " = " + obj.digit());
    }
}
