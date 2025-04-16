package ex_08_if_condition;

public class lab081_if_else {
    public static void main(String[] args) {
        int age=Integer.parseInt(args[0]);

        if(age>18){
            System.out.println("allowed to vote");
        }else{
            System.out.println("not allowed");
        }
    }
}
