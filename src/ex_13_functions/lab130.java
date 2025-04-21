package ex_13_functions;
import java.util.Scanner;
public class lab130  {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num 1");
        int a=sc.nextInt();

        System.out.println("enter the num 2");
        int b=sc.nextInt();

        int result_sum=sum(a,b);

        System.out.println(result_sum);
    }
    static int sum(int a,int b){
        return a+b;
    }
}
