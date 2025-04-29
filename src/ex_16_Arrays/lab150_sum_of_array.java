package ex_16_Arrays;

public class lab150_sum_of_array {
    public static void main(String[] args) {
        int[] numbers={1,2,3};

        int sum=0;
        for (int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }
}
