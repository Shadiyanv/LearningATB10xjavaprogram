package ex_08_if_condition;
import java.util.Scanner;
public class lab087_if_elseif_else {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num1");
        int num1=sc.nextInt();
        System.out.println("enter the num2");
        int num2=sc.nextInt();


        if(num1>num2){
            System.out.println("num1");
        }
        else if (num2>num1){
            System.out.println("num2");
        }else{
            System.out.println("num1=num2");
        }


    }
}
