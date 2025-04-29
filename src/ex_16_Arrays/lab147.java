package ex_16_Arrays;
import java.util.Arrays;
public class lab147 {
    public static void main(String[] args) {
        int[] marks={23,54,78,15,4};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("------------------------------------------------");

        //better way to print elements in array
         Arrays.sort(marks);
         for(int i=0;i<marks.length;i++){
             System.out.println(marks[i]);


        }
    }
}