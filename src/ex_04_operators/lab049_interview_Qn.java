package ex_04_operators;

public class lab049_interview_Qn {
    public static void main(String[] args) {
        int balaji_salary=12;
        boolean b=!(balaji_salary>10||balaji_salary<5);
        System.out.println(b);

        //balaji salary>10--->12>10--->true
        //balaji salary<5--->12<5-->false
        //true||false--->true
        //!(true)--->false
    }
}
