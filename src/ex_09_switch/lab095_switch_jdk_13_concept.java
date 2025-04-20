package ex_09_switch;
import java.util.Scanner;
public class lab095_switch_jdk_13_concept {
    public static void main(String[] args){

        //if using jdk>13 multiple match is also supported
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the item code");
        int item_code=sc.nextInt();

        switch(item_code){
            case 1,2,3:
               System.out.println("all of them are electronic gadget");
               break;
            case 4,6,7:
                System.out.println("this is mechanical items");
                break;
            default:
                System.out.println("none");
                break;
        }
    }
}
