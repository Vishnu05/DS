package Java.Basics.Loops;


public class Loops {
    public static void main(String args[]) {

        whileloop var = new whileloop();
        forloop var1 = new forloop();
        //  var.whileloops();
        //    var1.forlo();
        var1.enhancedfor();
        System.out.println(var1.hashCode());
    }
}

class whileloop {
    short loop = 1;

    void whileloops() {
        while (loop < 15) {
            System.out.println("The condition works " + loop);
            loop++;
        }
    }
}

class forloop {

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