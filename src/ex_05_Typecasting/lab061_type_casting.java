package ex_05_Typecasting;

public class lab061_type_casting {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //short s = phone_no; // implicit ?
        short s = (short) phone_no; // Explicit ?
    }

}
