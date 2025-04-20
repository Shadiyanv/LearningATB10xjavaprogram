package ex_08_if_condition;
import java.util.Scanner;
public class lab089_triangle_classifier {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of side1");
        double side1=sc.nextDouble();

        System.out.println("enter the length of side2");
        double side2=sc.nextDouble();

        System.out.println("enter the length of side3");
        double side3=sc.nextDouble();

        if(side1<=0||side2<=0||side3<=0){
            System.out.println("invalid input:side length must be positive");
        }else if(side1==side2&&side2==side3&&side1==side3){
            System.out.println("the triangle is equilateral");
        }else if(side1==side2||side2==side3||side1==side3){
            System.out.println("triangle is isosceles  ");
        }else{
            System.out.println("the triangle is scalene  ");
        }
        sc.close();
    }
}
