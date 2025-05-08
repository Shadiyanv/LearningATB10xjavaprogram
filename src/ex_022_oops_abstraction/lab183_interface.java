package ex_022_oops_abstraction;

public class lab183_interface {
    public static void main(String[] args) {
        P p=new P();
        p.icm1();
        p.icm2();
    }

}
class P implements I1{

    @Override
    public void icm1() {
        System.out.println("ICM1 complete");
    }

    @Override
    public void icm2() {
        System.out.println("ICM2 complete");
    }
}
interface I1{
    void icm1();
    void icm2();
}
interface I2{
    void icm3();
}