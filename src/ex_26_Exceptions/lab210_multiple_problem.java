package ex_26_Exceptions;

public class lab210_multiple_problem {
    public static void main(String[] args) {
        int a=0;
        int c=0;
        try {
            c=10/a;
            String s1=null;
            s1.trim();
        } catch (ArithmeticException|NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
