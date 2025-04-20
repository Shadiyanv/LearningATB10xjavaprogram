package ex_09_switch;

public class lab100_assignment_without_scanner {
    public static void main(String[] args){

        String name=(args[0]);

        int age=Integer.parseInt(args[1]);

        double salary=Double.parseDouble(args[2]);

        System.out.println("-----user Information");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);
    }
}
