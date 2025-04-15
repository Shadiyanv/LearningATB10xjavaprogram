package ex_06_Ternary_operator;

public class lab069_age_classification {
    public static void main(String[] args) {
        int age=25;
        //adult,minor,senior
        //senior>65
        //minor<18
        //adult>18

        //string result=(age<18)?Y(minor):N(adult or senior)
        //=>((age<65)?"adult":"senior")

        String result=(age<18)?"minor":((age<65)?"adult":"senior");
        System.out.println(result);
    }
}
