package ex_02_java_basics;

public class lab024_constants {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
        //this is not a constant,we can change the value of a
        final int b=10;
        //if we write final before data type or any other ,not possible to change the value
        System.out.println(b);
    }
}
