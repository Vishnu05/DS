package Java.Advanced.Exceptions;

public class Throw {

    static void ThrowCheck() {

        try {
            int a = 0 / 8;
            throw new Exception("hi");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("");

        }
    }

    public static void main(String args[]) {

        ThrowCheck();
    }
}


class a extends Throw {

}

class b  extends Throw
{

}