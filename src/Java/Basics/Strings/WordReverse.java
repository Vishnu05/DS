package Java.Basics.Strings;

public class WordReverse {

    public static void main(String a[]){

        String var="reverse.me";
        char arr[]=var.toCharArray();
        int len=var.length();

        for(int i=len-1;i>=0;i--){
            System.out.print(arr[i]); // not character, word has to reversed
        }

    }
}
