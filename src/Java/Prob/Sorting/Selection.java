package Java.Prob.Sorting;


public class Selection {

    static void sort(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int min_ele = i; //finding min element
            for (int j = 1 + i; j < n; j++) { //i+1 no need to check  with sorted element
                if (arr[j] < arr[min_ele]) {
                    min_ele = j; //min value index
                }
            }
            /** Swapping plays here*/
            int foo = arr[min_ele];
            arr[min_ele] = arr[i]; //resetting the min_else index ?
            arr[i] = foo;
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] arguments) {

        int arr[] = {10, 3, 56, 6, 27, 18};
        sort(arr);

        int a = 5, b = 4, temp;
        temp = a;
        // a=b;
        b = temp;
    }
}

//worst case o(n)2