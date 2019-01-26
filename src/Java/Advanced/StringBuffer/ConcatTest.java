package Java.Advanced.StringBuffer;


public class ConcatTest {
    public static void main(String[] args) {
        long start_time = System.currentTimeMillis();

        StringBuffer ob1 = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            ob1.append(1);
        }
        System.out.println("Buffer : " + (System.currentTimeMillis() - start_time));

        start_time = System.currentTimeMillis();
        StringBuilder ob2 = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            ob2.append(1);
        }
        System.out.println("Builder : " + (System.currentTimeMillis() - start_time));

    }
}