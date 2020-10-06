package PS.HackerRank.Alitmerk;

public class InnerClass {

    public static int a = 0;
    private static int b = 0;
    public  static class inner{

        //static int a = 9;

        public static int add(int a, int b){
            return a + b;
        }
    }

    public  static void foo(Object o) {
        System.out.println("object imp");
    }

    public static void foo(String s) {
        System.out.println("string s");
    }

    public static void main(String[] args) {

        InnerClass.inner ob = new InnerClass.inner();
        System.out.println(ob.add(5, 8));

        InnerClass obj = new InnerClass();
       foo(null);

        int a[] = new int[5];
        byte b[] = new byte[5];
        char c[] = new char[6];
        double d[] = new double[5];

        System.out.println(a[0]+""+b[0]+""+c[0]+""+d[0]);


        System.out.println(1 +
                2 ==+
                3+
                +
                +5 );
//                ++6 +
//                --7);




    }
}
