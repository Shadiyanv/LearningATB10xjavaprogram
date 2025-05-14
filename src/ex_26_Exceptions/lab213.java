package ex_26_Exceptions;

import java.util.Scanner;

public class lab213 {
    public static void main(String[] args) {
        System.out.println("start program");
        Scanner sc=null;
        sc=new Scanner((System.in));
        int v=sc.nextInt();

        try {
             int a=10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("closing sc!");
        }



    }
}
