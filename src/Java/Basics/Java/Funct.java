package Java.Basics.Java;
//
//class name {
//
//
//}

class Funct {

    String zoho = "The dream company";
    int year = 18;
    boolean coin = true;
    static String meth = "meth is a cocaine to get high";

    double f(int a) {

        return 4;
    }


    public void somefun() {

        System.out.println(year); // the instance variable can access within the method
    }

    private void encap() {

        int a, b;
        a = 10;
        b = 5;
        a = 1;

        if (a < b) {
            System.out.println("The private method checks which is greater");
        } else {
            System.out.println("the value is higher");
        }
    }

    protected void idk() {

        System.out.println(meth);
    }

    public static void main(String args[]) {

        Funct ob = new Funct();
        ob.somefun();
        ob.encap();
        ob.idk();
        System.out.println(ob.year); // instance variable accessing
        System.out.println(meth + " too good..");
        // System.out.println(year);
    }
}


