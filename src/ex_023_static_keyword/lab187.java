package ex_023_static_keyword;

public class lab187 {
    public static void main(String[] args) {
        A a=new A();
        A.m1();
    }

}
class A{
    static {
        System.out.println("called only once when class is loaded");
        System.out.println("you can write a code reading  a excel,file,database");
    }
    static int a=10;
    static void m1(){
        System.out.println("static function");
    }
}