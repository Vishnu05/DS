package Java.Basics.Loops;


public class Loopss {
    public static void main(String args[]) {

       // whileloop var = new whileloop();
        forloopss var1 = new forloopss();
        //  var.whileloops();
        //    var1.forlo();
        var1.enhancedfor();
        System.out.println(var1.hashCode());
    }
}

class forloopss {

    int a, b;

    void forlo() {

        for (a = 1; a < b; a++) {
            System.out.println("This is bad \n" + a);
        }
    }

    void enhancedfor() {

        int a[] = {1, 2, 4, 18, 5};
        System.out.println(a.length);
        int b = 0;
        for (int c : a) {
            System.out.println(c);
            // b++;
        }
        while (b < a.length) {
            System.out.println(a[b]);
            b++;
        }
    }


}