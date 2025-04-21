package ex_10_for_loop;

public class lab116_even_odd_continue {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++) {
            if (i % 2 ==0) {
                System.out.println("even" + i);
                continue;
            }
            System.out.println(i);
        }
    }
}

