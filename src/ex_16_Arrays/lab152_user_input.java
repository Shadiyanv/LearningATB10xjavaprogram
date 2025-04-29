package ex_16_Arrays;

import java.util.Scanner;

public class lab152_user_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size(length) of array");
        int size =sc.nextInt();

        int[] numbers=new int[size];
        // String[] names = new String[size];
        //float[] names = new float[size];


        for(int i=0;i<numbers.length;i++){
            System.out.println("enter the numbers");
            numbers[i]=sc.nextInt();
        }

        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

    }
}
