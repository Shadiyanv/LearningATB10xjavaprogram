package ex_04_operators;

public class lab048_OR_AND_gate {
    public static void main(String[] args) {
        //||-->OR gate
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||true);
        System.out.println(false||false);


        //T||T-->T
        //T||F-->T
        //F||T-->T
        //F||F-->F


        //AND gate && only true && true returns true

        System.out.println(true&&true);    //o/p--->T
        System.out.println(true&&false);   //O/P--->F
        System.out.println(false&&true);   //O/P--->F
        System.out.println(false&&false);  //O/P--->F
    }


}
