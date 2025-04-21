package ex_14_string_functions;

public class lab138 {
    public static void main(String[] args) {
        String s1="Hello";//scp?1
        String s4="Hello";//scp?2
        String s2=new String("Hello");//heap area?1
        String s3=new String("Hello");//heap area?2
        String s5=new String("hello");//heap area?3

        //== it check location reference,which area they are belongs to
        System.out.println(s1==s3);
        System.out.println(s2==s3);
        System.out.println(s1==s2);
        System.out.println(s1==s4);
        System.out.println(s3==s4);

        System.out.println("-------------------------------");

        //to check values equal
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));


    }
}
