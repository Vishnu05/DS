package Java.Basics.Prob;

public class trest {


    static int findMinUtil(int dest, int[] exercise, int steps, int i) {

        if (i < 0) {
            return -1;
        } else if (dest == 1) {
            return findMinUtil(dest + exercise[i], exercise, steps - 1, i - 1);
        } else if (dest % exercise[i] == 0) {
            return steps + (dest / exercise[i]);
        } else if (dest % exercise[i] == dest) {
            return findMinUtil(dest, exercise, steps, i - 1);
        } else {
            return findMinUtil(dest - exercise[i], exercise, steps + 1, i);
        }

    }

    static void findMin(int destConfidence, int[] exercises) {

        int[] sortedFromMax = new int[exercises.length];
        for (int k = exercises.length - 1, i = 0; k >= 0 && i < exercises.length; k--, i++) {
            sortedFromMax[i] = exercises[k];
        }

        System.out.println("sorted Value : ");
        for (int r : sortedFromMax) {
            System.out.print(r + ",");
        }


        for (int i = 10; i < destConfidence; i += 10) {
            System.out.println("\n----\nMin number of steps to reach " + i + " : " + (findMinUtil(i, exercises, 0, exercises.length - 1)) + "\n");
        }


    }

    public static void main(String[] args) {

        findMin(783, new int[]{2, 3, 5, 7});
    }
}

// modulus finder