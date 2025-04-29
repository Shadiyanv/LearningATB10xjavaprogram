package ex_16_Arrays;

public class lab149_reverse_order_array{
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        for(int i=0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }

        for(int i1=numbers.length-1;i1>=0;i1--){
                System.out.println(numbers[i1]);
        }

    }
}