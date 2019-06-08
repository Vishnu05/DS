package Java.Basics.Java;

public class Reference {

    int issue;
    String issueName;

    static class Engines {
        Engines my;
    }

    public static void main(String args[]) {

        Reference obj = new Reference();

        obj.issue = 1;
        obj.issueName = "Reference variable ";

        Engines go = new Engines();
        obj.issue = 4;

    }
}
