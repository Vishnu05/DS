
public class Fibonacci {

    public static void main(String args[]) {

        int a = 0,d=1, b = 1, c=10,temp;

        for(int i=0;i<c;i++){

        // int

            temp=a+d;
            System.out.println(temp);
            a=d;
            d=temp;
          //  System.out.println(temp);

        }

       // System.out.println(temp);
        System.out.println(a+" "+d);
        System.out.println(c);

    }
}




  /*//  System.out.println("S"+args[0]);

        //just looping

        System.out.println(a);
        String obs=new String("vishnu");
        System.out.println(obs);
        System.out.println(new String());

        Fibonacci go=new Fibonacci();
        System.out.println(""+new Fibonacci());
        System.out.println(Integer.toHexString(go.hashCode()));

         int n=1,m=10;
        do {

            System.out.println(n);

            m--;
        }while (++n<m);
         System.out.println(m+" "+n);
        {

        }


    }*/