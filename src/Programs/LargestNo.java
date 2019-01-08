package Programs;

public class LargestNo {

    public static void main(String args[]) {

        int a[] = {5, 9, 3, 78, 653,57,1,6,8};
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            /*The largest number will be assigned to max whenever it encounters*/
            if (a[i] < max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
