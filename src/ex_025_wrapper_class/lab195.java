package ex_025_wrapper_class;

public class lab195 {
    public static void main(String[] args) {
        int a=10;
        Integer b=a;
        System.out.println(b);
        //called boxing-->converting int to Integer
        System.out.println(Integer.MIN_VALUE);
        Integer a2=42;
        int v=a2;//unboxing
        System.out.println(v);

    }
}
