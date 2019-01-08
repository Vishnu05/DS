package Java.Basics.Boxing;


public class packages {

    void display(){
        System.out.println(" public ");
    }
    public  static void main(){



    }
}

 class a{

    protected class b{

        void display(){
            System.out.println("Protected class");
        }
    }

    b ob=new b();
    c oi=new c();
  //  ob.display();

    private class c{

        void display(){
            System.out.println("Private class");
        }
    }
}

