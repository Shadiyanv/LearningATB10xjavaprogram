package ex_06_Ternary_operator;

public class lab064_TO {
    public static void main(String[] args) {
        //syntax-->result=condition?expression1:expression:2
        int number=-5;
        String result=number>0?"positive number":"negative number";
        System.out.println(result);
    }
}
