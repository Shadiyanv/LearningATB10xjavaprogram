package ex_26_Exceptions;

public class lab197_exceptions {
    public static void main(String[] args) {

        System.out.println("start program");
        int b=0;
        try {
            String ip=args[0];  //array index bound exception
            int a=Integer.parseInt(ip);//number format exception
            b = 100/a;//Arithmetic Exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
        System.out.println("end the program");
    }
}
