package PS.Sorting.Recursion;

public class RecSort {

    static void sort(int n) {

        if (n < 1) {
           // return n;
        } else
            sort(n - 1);
        System.out.println(n);


        for (int i=0;i<n;i++){
            int min_index=i;
            for(int j=i;j<n;j++){
                if(n<j){
                   min_index=j;
                }
            }
            int temp=min_index;
            min_index=i;
            i=temp;
            System.out.println("I have no clue about this program"+temp);
        }
       // return n;
    }

    public static void main(String[] args) {

        sort(5);


    }
}
