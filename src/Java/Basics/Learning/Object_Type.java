package Java.Basics.Learning;

public class Object_Type {

    public static <E> void generic(E[] arr) {

        for (E i : arr) {

        }
    }

    public static void main(String[] args) {

        Object ob = 1;
        int a = (int) ob;
        System.out.println(a);
//        ob.toString()

        int[] arr = {13, 5, 87, 34};
        Object ar = arr;

//        generic(arr);
    }
}
