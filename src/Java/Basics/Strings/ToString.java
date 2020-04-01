package Java.String;

public class ToString {

    int a;
    String name;
    boolean type;

    ToString(int a,String name,boolean type){
      this.a=a;
      this.name=name;
      this.type=type;
    }

 //   @Override
    public String toString() {  //object -> string
        return a +" "+ name +" "+ type;
    }

    public static void main(String args[]){

        ToString ob=new ToString(1,"vishnu",true);
        //System.out.println(ob.toStrings()); //explicit
        System.out.println(ob);


    }
}
