package Java.Basics.Prob;

class Armstrong {

    /* To naive solution */
    public static void main(String args[]) {

        int a[] = {1, 1, 3};
        int temp[] = new int[a.length];
        int count = 0;

        String c = "2111";
        int d = Integer.parseInt(c);

        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i] * a[i] * a[i];
            System.out.print(temp[i] + " ");
            count += temp[i];
        }

        StringBuilder ob = new StringBuilder();
        for (int i : a) {
            ob.append(i);
        }
        int b = Integer.parseInt(ob.toString());
        System.out.println(b);

        if (b == count) {
            System.out.println("It is a armstrong number :" + count);
        } else
            System.out.println("It is not a armstrong number :" + count);

    }
}

