package ex_06_Ternary_operator;

public class lab065_nested_ternary {
    public static void main(String[] args) {
        //nested ternary
        //result=condition1?expression1:(condition2?expression2:expression3)
        int number=15;
        String result=(number>10)?(number>20?"G>20":"between 10 to 20"):"B";
        System.out.println(result);

        //resolve the inner bracket first
        //(number>20)?"G>20":"between 10 to 20"
        //o/p-->between 10 to 20
        //inner bracket will replace with between 10 to 20
        //string result =(number>10)?"between 10 to 20":"B";
        //o/p-->between 10 to 20
    }

}
