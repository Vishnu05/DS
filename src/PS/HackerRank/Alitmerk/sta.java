package PS.HackerRank.Alitmerk;

public class sta {

    int x = 8;

    static {
        int y = 9;
    }

    public static void main(String[] args) {
        int x = 5;
        {
            int y = 6;
            System.out.println(x + " "+ y);
        }

        System.out.println( 2/ 0);
    }
}
