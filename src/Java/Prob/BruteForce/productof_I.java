package Java.Prob.BruteForce;

public class productof_I {

    public static void main(String args[]){

        int arr[]={2,3,4,5,6};

        int temp[]=new int[arr.length];
        int foo=0;
        for(int i=1;i<=arr.length;i++){

            for(int j=1;j<=arr.length;j++){

                foo=i*j;

            }

            temp[i]=foo;
            System.out.println(temp[i]);
        }
    }
}
