package ex_04_operators;

public class lab043_Interview_concat_plus {
    public static void main(String[] args) {
        String first_name="pramod";
        String last_name="dutta";
        int a=10;
        int b=10;
        System.out.println(first_name+last_name);
        System.out.println(first_name+last_name+a+b);
        //all of them are acting like a string
        //pramoddutta1010 first operator behave concatenation

        System.out.println(a+b+first_name+last_name);
        //first do mathematics and then cocatenatio

        System.out.println(first_name+last_name+(a+b));
        //if you use bracket mathematics takes place
        //it follow BODMAS-->bracket of div,mul,add,sub

    }
}
