package ex_26_Exceptions;

public class lab207 {
    public static void main(String[] args) {
        int c=0;
        int b=0;
        try {
            b=10/c;
        } catch (Throwable e) {  //can we add throwable instead of Exception e? yes or we can add Arithmetic Exception
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
