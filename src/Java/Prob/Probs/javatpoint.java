package Java.Prob.Probs;

public class javatpoint {

    static void find(char arr[],int len){

        String ab="vat";
        char abs[]=ab.toCharArray();

        int j=0;
        for(int i=len-1;i>0;i--){
            if(arr[i]==abs[j]);
            System.out.println(arr[i]);
            j++;
        }

    }

    public static void main(String[] args) {

        String java="javatpoint";
        int len=java.length();

        char arr[]=java.toCharArray();
        find(arr,len);


    }
}
