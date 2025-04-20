package ex_09_switch;

import java.util.Scanner;

public class lab099_assignment {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String name=sc.next();

        System.out.println("enter the age");
        int age=sc.nextInt();

        System.out.println("enter the salary");
        double salary=sc.nextDouble();

        System.out.println("--------User Information---------");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);
    }
}
