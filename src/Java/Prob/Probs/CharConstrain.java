package Java.Prob.Probs;

public class CharConstrain {

    public static void main(String[] args) {

        String a="babababa";
        char [] arr=a.toCharArray();
        int j=1;
        int count=0;
        for(int i=0;i<a.length();i++){
            if (arr[i]==arr[j]) {
                count+=1;
            }
            if(j!=a.length()-1){
                j++;
            }
        }
        count=count-1;
        System.out.println(count);
    }
}
