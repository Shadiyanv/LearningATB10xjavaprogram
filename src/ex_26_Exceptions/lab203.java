package ex_26_Exceptions;

public class lab203 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a=10/0;
        } catch (Exception e) {
            System.out.println("are you fool?/by zero is not possible!!!");//custom Exception
        }
        System.out.println("2");
    }
}
