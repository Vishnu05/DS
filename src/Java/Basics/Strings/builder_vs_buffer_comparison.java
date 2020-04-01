package Java.String;

public class builder_vs_buffer_comparison {

    public static void main(String[] args) {

        long start_time=System.currentTimeMillis();

        StringBuffer b=new StringBuffer();

        for(int i=0;i<1000;i++){
            b.append(1);
        }

        System.out.println("String Buffer : "+(System.currentTimeMillis()-start_time));

        start_time=System.currentTimeMillis();
        StringBuilder ob=new StringBuilder();

        for(int i=0;i<1000;i++){
            ob.append(1);
        }
        System.out.println("String Builder : "+(System.currentTimeMillis()-start_time));
    }
}
