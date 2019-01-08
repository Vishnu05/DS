package Java.Basics.OOPS.Encapsulation;

public class Private {

    private static class vis {

        int encapsulation;
        String Encapsulations = "static methods, fields, class";

        static {
            System.out.println("What the heck is this ??    ");
            int a, b;
            a = 10;
            b = 10;
            int c;
            c = a + b;
            System.out.println(c);
        }

        void fun() {

            try {
                encapsulation = Encapsulations.length();
                System.out.println(encapsulation);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String args[]) {

        Private obj = new Private();

        vis ob = new vis();
        ob.fun();
        System.out.println("encapsulation : "+ob.encapsulation);
        ob.encapsulation=20;
        System.out.println(ob);
        System.out.println(ob.encapsulation);
    }
}

