package Java.Basics.Prob;

import java.util.ArrayList;

public class Vowels extends ext{

    public static void main(String args[]){

        String vow="vishnu ";
        char [] arr={'a','e','i','o','u'};

        char [] arr1=vow.toCharArray();
        int len=vow.length();

        int temp=0;
        for(int i=0;i<5;i++){

            for(int j=0;j<len;j++){

                if(arr[i]==arr1[j]){
                    temp +=1;
                }
            }

        }
        System.out.println("vowels count "+temp);

        String name="Typecasting";
        int type=0;

        Private pr=new Private();
        pr.mem();

        Object ob=new ArrayList<>();
        ((ArrayList) ob).add(5);


    }
}

interface a{
}interface b{
}
interface c{
}
class d implements a,b,c {

}

 class Private{

    private int a;
    private String b;

       void mem(){
       System.out.println(a);
       System.out.println(b);
    }
}

class ext extends Private {

   void men(){
   }
}