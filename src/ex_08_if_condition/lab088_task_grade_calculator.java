package ex_08_if_condition;
import java.util.Scanner;
public class lab088_task_grade_calculator {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the score");
        int score=sc.nextInt();
        char grade='F';


        if(score>=90&&score<=100){
            System.out.println("grade A");
        }else if(score>=80&&score<=89){
            System.out.println("grade B");
        }else if(score>=70&&score<=79){
            System.out.println("grade C");
        }else if(score>=60&&score<=69){
            System.out.println("grade D");
        }else if(score<=0||score>=100){
            System.out.println("LOL ,YOU ARE GOD LEVEL");
        } else {
            System.out.println("grade F");
        }
    }
}
