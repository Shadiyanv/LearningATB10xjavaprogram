package ex_019_oops_inheritance;

public class lab170_multilevel_inheritance {
    public static void main(String[] args) {
        son2 pramod=new son2();
        pramod.gf();

        father2 f=new father2();
        f.extra();

        grand_father gf=new grand_father();
        gf.gf();

        pramod.home();
    }
}
