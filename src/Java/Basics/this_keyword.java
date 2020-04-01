package Java.Basics;

public class this_keyword {

    static String name="" ;
    static String dept ="";

    this_keyword(String name, String dept) {

        this.name = name;
        this.dept = dept;
        //System.out.println("Department name : "+name+ " "+dept);
    }

    void sta() {
        System.out.println("Department name : "+name+ " "+dept);
    }

    public static void main(String[] args) {

        this_keyword obj=new this_keyword("Computer Science","STEM");
        obj.sta();
    }
}


class nams {

    int a;
    int b;

    nams( int x, int y ){
        this.a = x;
        this.b = y;
    }
}