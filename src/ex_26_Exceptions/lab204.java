package ex_26_Exceptions;

public class lab204 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a=10/0;
        } catch (Exception e) {
            e.printStackTrace();//full problem details with line number\]]]]]
        }
        System.out.println("2");
    }

}
