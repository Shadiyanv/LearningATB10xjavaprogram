package ex_08_if_condition;

import java.util.Scanner;

public class lab082_if_else_using_scanner {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();
        if(age>18){
            System.out.println("allowed to vote");
        }else{
            System.out.println("not allowed");
        }


    }
}
