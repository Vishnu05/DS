import java.util.Map;
import java.util.*;
import com.sun.org.apache.xpath.internal.SourceTree;

public class innerclasss {

    static public void vscode () {
            System.out.println("VS code also has good editing for java");
     }

     innerclasss() {
         System.out.println("Constructor");
     }

     static {
         System.out.println("Static method is getting intialized first");
     }

    public static void main(String[] args) {

        System.out.println("hello vs code ");

        vscode();
        for (int i = 0; i < 3; i++) {
                System.out.println("welcome to vs code");
        }

        Map<String, Integer> hm = new LinkedHashMap<>();
        hm.put("vishnu", 1);
        hm.put("ide", 2);

        System.out.println(hm);

        int a = 5;
       

    }

    static class aa {

    }
}