package ex_26_Exceptions;

public class lab208_multiple_catch {
    public static void main(String[] args) {
         int c=0;
         int b=0;
        try {
            b=10/c;
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
//not good method ,Bad programming skill