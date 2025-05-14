package ex_26_Exceptions;

public class lab209_good_tester {
    public static void main(String[] args) {
        int c=0;
        int b=0;
        try {
            b=10/c;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
