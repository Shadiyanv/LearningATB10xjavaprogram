package ex_21_oops_constructor;

public class lab178 {
    public static void main(String[] args) {

        A a1=new A();
        A a2=new A();
        System.out.println(a1);
        System.out.println(a2);
    }
}
        class A{
    A(){
        System.out.println("DC");
    }
        }