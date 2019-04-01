package Basics;

public class classe {

    int a;

    public void func(int a) {
        this.a = a;
        if (a > 5) {
            System.out.println("my dad is going in wrong train");
        } else {

        }
    }

    void print() {
        System.out.println("The value of a : " + a);
    }

    public static void main(String agrs[]) {

        classe obj;
        obj = new classe();
        obj.func(6);
        obj.print();
    }
}
