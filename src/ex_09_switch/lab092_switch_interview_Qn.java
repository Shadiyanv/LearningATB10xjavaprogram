package ex_09_switch;
import java.util.Scanner;
public class lab092_switch_interview_Qn {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the browser name");
        String browser=sc.next();


        switch(browser){
            case "chrome":
                System.out.println("starting  chrome");
                break;
            case "firefox":
                System.out.println("starting firefox");
                break;
            case "edge":
                System.out.println("starting edge");
                break;
            default:
                System.out.println("No idea which browser is this");
                break;
        }
    }
}
