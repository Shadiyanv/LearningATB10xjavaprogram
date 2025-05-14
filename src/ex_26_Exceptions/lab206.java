package ex_26_Exceptions;

public class lab206 {
    public static void main(String[] args) {
        int c=0;
        int b=0;
        try {
            b=10/c;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
