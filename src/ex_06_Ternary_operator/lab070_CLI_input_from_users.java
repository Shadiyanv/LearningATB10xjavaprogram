package ex_06_Ternary_operator;

public class lab070_CLI_input_from_users {
    public static void main(String[] args) {
        //take input
        //take input--->run button-->edit configuration-->give input
        String age_String=args[0];
        int age=Integer.parseInt(age_String);
        System.out.println(age);
        String CanIGoGoa=age>=24?"yes":"no";
        System.out.println(CanIGoGoa);

    }
}
