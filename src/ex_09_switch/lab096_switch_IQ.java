package ex_09_switch;
import java.util.Scanner;
public class lab096_switch_IQ {
    public static void main(String[] args){
       int item_code=001;
        switch(item_code){
            case 001->System.out.println("001");
            case 002-> System.out.println("002");
            case 003-> System.out.println("003");
            default-> System.out.println("default");
            //without using break (jdk>13)we can use -> .but traditionally we use  older version(break)
        }


    }
}
