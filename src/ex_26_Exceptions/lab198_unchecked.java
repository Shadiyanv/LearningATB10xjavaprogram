package ex_26_Exceptions;

public class lab198_unchecked {
    public static void main(String[] args) {
        int a=0;
        int b=10;
        int c=b/a;//ArithmeticException//unchecked
        System.out.println(c);
    }
}
