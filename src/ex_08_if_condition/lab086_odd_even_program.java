package ex_08_if_condition;
import java.util.Scanner;
public class lab086_odd_even_program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the int number");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("even number");
        }else {
            System.out.println("odd number");
        }
        sc.close();
    }
}
