package ex_13_functions;
import java.util.Scanner;
import java.math.BigInteger;


public class lab129 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num 1");
        int a = 0;
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        } else {
            System.out.println("enter int only");
            System.exit(0);
        }
        System.out.println("enter the num 2");
        int b = sc.nextInt();

        int result_sum = sum(a, b);
        int result_sub = sub(a, b);
        int result_mul = mul(a, b);
        int result_mod = mod(a, b);
        int result_div = div(a, b);


        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_mod);
        System.out.println(result_div);
    }

        static int sum(int a,int b){
            return a+b;
        }

        static int sub(int a,int b){
            return a-b;
        }

        static int mul(int a,int b){
            return a*b;
        }
        static int mod(int a,int b){
            return a%b;
        }

        static int div(int a,int b){
            if(b==0){
                System.out.println("div by zero is not allowed");
            }
            return a/b;
        }
    }
