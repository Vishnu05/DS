package Java.Basics.Learning;

public class PackageClass {

    /** Package private is only accessable in that package
     * public can be access in anywhere
     * while private can access only in that class  */
    public int a = 10;
    String s = "package private string";
    private boolean b = true;
    public static void main(String[] args) {

        PackageClass obj = new PackageClass();

    }
}

class PC extends PackageClass {

    PC() {
        System.out.println(a);
        System.out.println(s);
        System.out.println("IF we try to access b it will throw an error");
    }
}
