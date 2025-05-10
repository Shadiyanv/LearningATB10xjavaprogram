package ex_023_static_keyword;

public class lab186 {
    public static void main(String[] args) {
        ATB umesh=new ATB(989544955,"umesh");
        ATB anubha=new ATB(989588255,"anubha");
        System.out.println(anubha.name);
        System.out.println(anubha.phone_np);
        System.out.println(ATB.course_name);
        ATB.m1();

    }
}
class ATB{
    static String course_name="ATB";
    int phone_np;
    String name;

    public ATB(int phone_np,String name){
        this.phone_np=phone_np;
        this.name=name;
    }
    void display(){
        System.out.println(this.phone_np+this.name+course_name);
    }
    static void m1(){
        System.out.println("mark attendance");
    }

}