package ex_26_Exceptions;

public class lab199_unchecked {
    public static void main(String[] args) {
        String name=null;
        name.trim();//Null pointer exception
    }
}
