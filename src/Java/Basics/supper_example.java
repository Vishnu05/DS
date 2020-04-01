package Java.Basics;

class par{

    par(){
        System.out.println("Super Class");
    }


}

class sub_class extends par{

    sub_class(){
        System.out.println("base class");
    }

    sub_class(int a){
        System.out.println(a);
    }
}


public class supper_example {

    public static void main(String[] args) {

        sub_class ob=new sub_class();
        sub_class obj=new sub_class(1);
    }
}
