package ex_21_oops_constructor;

public class lab179 {
    public static void main(String[] args) {
        B b1=new B();
        System.out.println(b1);
    }
}
    class B {
        B() {
            System.out.println("I want to read a csv file");
            System.out.println("open the page before loading the scripts");
            System.out.println("you can do anything which you want to do,when the object is created");
        }
    }



