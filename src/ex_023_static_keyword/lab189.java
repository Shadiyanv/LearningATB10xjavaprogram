package ex_023_static_keyword;

public class lab189 {
    public static void main(String[] args) {
        Automation t1=new Automation();
        System.out.println(t1.driver);
        System.out.println(Automation.driver);
    }
}
class Automation{
    static String driver="chrome";
}