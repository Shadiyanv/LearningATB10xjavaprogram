package ex_16_Arrays;

import java.util.Arrays;

public class lab151_IQ_find_second_largest_nmbr {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};

        Arrays.sort(num);
        System.out.println(num[num.length-2]);
    }
}
