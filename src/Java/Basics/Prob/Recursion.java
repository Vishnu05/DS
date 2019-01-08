package Java.Basics.Prob;

public class Recursion {


    static int main(int num) {

         int a;
        if (num == 0) {
            return 1;
        } else
            return num - main(num - 1);
    }


    public static void main(String args[]) {

        int num = 5, temp = 0, count = 0;

        for (int i = 0; i < num; i++) {
            if (num - temp == 0) {
                System.out.println(" mod");
            }
            temp++;
            ++temp;
            count += 1;
        }

        System.out.println("co" + count);
        num++;
        System.out.println(num);


       /* for ( int i=0;i<num;i++){
            if(num%2==0){
                System.out.println("Modulus works");
            }else
                System.out.println("Doesn't");
        }*/
    }
}
