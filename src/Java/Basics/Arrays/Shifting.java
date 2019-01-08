package Java.Basics.Arrays;

public class Shifting {

    public static void main(String args[]){

      int [] a={1,5,8,6};
      int i=0;
      a[2]=54;

      a[2]=12;

      while(i<a.length) {
          System.out.println(a[i]);
          i++;
      }
      // System.arraycopy
    }
}
