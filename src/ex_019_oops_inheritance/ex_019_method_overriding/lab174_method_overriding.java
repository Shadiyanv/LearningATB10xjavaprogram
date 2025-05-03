package ex_019_oops_inheritance.ex_019_method_overriding;

public class lab174_method_overriding {
    public static void main(String[] args) {
        pramod p=new pramod();
        p.home();


        father f1=new father();
        f1.home();

        father f2=new pramod();
        f2.home();
    }
}
