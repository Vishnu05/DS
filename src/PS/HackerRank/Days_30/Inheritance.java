package PS.HackerRank.Days_30;

import java.util.*;

class Personsaa {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Personsaa(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }


    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }

}


class Student extends Personsaa {
    private int[] testScores;
    public int as = 0;

    Student(String ln, String fn, int id, int[] arr) {
        super(ln, fn, id);
        as = arr.length;
        testScores = Arrays.copyOf(arr, as);

    }

    public char calculate() {
        int score = 0;
        for (int i = 0; i < as; i++) {
            score += testScores[i];
        }
        score = score / as;
        System.out.println(score);

        if (score >= 90 && score <= 100) {
            return 'o';
        } else if (score >= 80 && score <90) {
            return 'E';
        } else if (score >= 70 && score < 80) {
            return 'a';
        } else if (score >= 55 && score < 70) {
            return 'p';
        } else if (score >= 40 && score < 55) {
            return 'd';
        } else {
            return 'T';
        }

    }
}


class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}