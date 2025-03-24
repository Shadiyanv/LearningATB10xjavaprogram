package ex_06_Ternary_operator;

public class lab063_ternary_operator {
    public static void main(String[] args) {
        //syntax-->result=condition?expression1:expression:2
        int age=18;
        String canIvote=age>=18?"yes you can vote":"no you can't vote";
        System.out.println(canIvote);
    }
}
