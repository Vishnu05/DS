package Java.String;

public class stringBuilder {

    public static void main(String args[]) {


        //character
        //reverse the word
        String name = "Ameer Ali";
        //using in-built method
        StringBuffer ob = new StringBuffer(name);
        System.out.println(ob.reverse());

        char ch[] = name.toCharArray();
        int len = name.length();

        for (int i = len - 1; i >= 0; i--) {
            System.out.print(ch[i] + " ");
        }

        StringBuffer ob1 = new StringBuffer(name); //thread safe synchronized
        ob1.append("Angular js");
        System.out.println(ob1);
        System.out.println(ob1.capacity() + " " + ob1.length());
        ob1.append(1);
        ob1.replace(3, 10, " Node js sever side ");
        ob1.insert(2, "hey are you there ?");
        ob1.delete(0, 5);
        ob1.deleteCharAt(10);
        System.out.println(ob1 + " " + System.currentTimeMillis());

        StringBuilder o = new StringBuilder("non-immortality");  //not thread safe
        String as = "immortality"; //thread pool
        System.out.println(as+" "+o);
        System.out.println(o.capacity());
        System.out.println(ob.length()+"  "+as.length());
        int a=Integer.parseInt(as);
        as=Integer.toString(a);


    }
}
