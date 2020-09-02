package PS.Sorting.Recursion;

public class TwoWay {

    static int direct(int a){

        //direct();
        direct(5);
        indirect(5);
        return a;
    }

    static int indirect(int b){
        
        indirect(b-1);
        return b;
    }

    public static void main(String []args){

        direct(4);
        indirect(3);
    }
}
