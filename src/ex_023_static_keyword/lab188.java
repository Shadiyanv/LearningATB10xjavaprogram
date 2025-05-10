package ex_023_static_keyword;

public class lab188 {
    public static void main(String[] args) {
        ATB1 atb=new ATB1();
    }
}
class ATB1{
    {
        System.out.println("IIB-this is called when object is created");
    }
    static {
        System.out.println("load the class?i will execute");
    }
}