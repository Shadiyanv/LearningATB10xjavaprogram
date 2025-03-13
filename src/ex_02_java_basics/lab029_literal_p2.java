package ex_02_java_basics;

public class lab029_literal_p2 {
    public static void main(String[] args) {
        float pi=3.14f;
        //float type variable
        //float pi=3.14F;IS also possible
        final int a=10;
        //10 is a literal,but value of a is constant,this is integral literal
        final int AGE;
        AGE=19;
        //AGE=29;we can't assign the value of final again,because it is constant
        System.out.println(AGE);
    }
}
