package ex_05_Typecasting;

public class lab062_typecasting_used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
//        int total_int = course+GST; // Narrowing - Implicit
        int total_int = course + (int) GST; // Narrow - Explicit
        float total = course + GST; // Widenning - implicit
        float total2 = (float) course + GST; // Widenning - Explicit
        System.out.println(total);//o/p-->118.45


        //int course=100;
        //float GST=18.45;
        //int total=course+int(GST);
        //System.out.println(total);//o/p-->118



    }
}