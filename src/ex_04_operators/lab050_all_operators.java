package ex_04_operators;

public class lab050_all_operators {
    public static void main(String[] args) {
        boolean b1=true;  //assignment operator
        int a=10;
        int b=20;
        System.out.println(a+b); //arithmetic operator
        System.out.println(a>b);  //relational operator
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);



        //compound assignment operators
        //+=,-=,/=,*=

        int age=10;
        age=age+10; //or use age+=10
        System.out.println(age); //o/p-->20

        //a-=10 or a=a-10
        //10-10=0

        age/=10;   //age=age/10
        System.out.println(age);


    //o/p--->    //30
                 //false
                 //false
                 //false
                 //true
                 //20
                 //2
    }
}
