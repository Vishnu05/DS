package Java.Prob.Probs;

class triangle {


    static void spaces(int space,int n) {
        for (int i = 0; i < space; i++) {
            System.out.print(" ");
            space++;
            if (space == n) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int space = 2;


        for (int i = 0; i < n; i++) {
           // spaces(space,n);

            for(int k=n;k>=i;k--){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}