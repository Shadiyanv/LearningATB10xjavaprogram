package ex_10_for_loop;

public class lab113_odd_even_50 {
    public static void main(String[] args) {
        //to find even numbers less than 50

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("even number"+i);
            } else {
                System.out.println("odd  number"+i);
            }
        }
    }
}