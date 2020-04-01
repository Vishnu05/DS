package Java.Basics;

public class Getter_Setter {
    private int list;
    private int argument;
    private String buffer;
    private boolean recursion;
    private String Sort;

    public int getList() {
        return list;
    }

    public int setList(int list) {

        return this.list = list;
    }

    public String getbu() {
        return buffer;
    }

    public String setb(String buffer) {

        return this.buffer = buffer;
    }

    public static void main(String[] args) {

        Getter_Setter obs = new Getter_Setter();
        obs.setList(2);
        obs.setb("eminem");
        System.out.println(obs.getList() + "     +" + obs.getbu() + " " + obs.setb(" Not afraid"));
    }
}
