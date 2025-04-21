package ex_14_string_functions;

public class lab137 {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        //how many strings are in scp-->1  because hello string is also available in scp,so second string is ot stored in scp


        String s3=new String("hello");
        String s4=new String("hello");
        //how many strings are in heap area-->2  when we use new operator always new strings are created
    }
}
