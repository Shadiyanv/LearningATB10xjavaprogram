package ex_05_Typecasting;

public class lab060_typecasting_narrowing {
    public static void main(String[] args) {
        int val = 200;
        //byte b = val; // // Invalid - Implicit Casting narrowing is not allowed
        byte b = (byte) val; // // // Valid -> Explicit Casting -  allowed
        // Data Loss:

    }
}