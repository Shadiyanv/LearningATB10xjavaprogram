package ex_06_Ternary_operator;

public class lab068_max_of_three {
    public static void main(String[] args) {
        //find the largest number out of n1,n2,n3
        //max(n1,n2,n3)
        //step1:find the input and output
        //n1,n2,n3-->which data type-->int
        //o/p-->int
        //ask for example-->23,34,10--->34
        //step2:
        //n1>=n2-->Y1:N1
        //Y1-->n1>=n3?Y(n1):N(n3)
        //N1-->n2>=n3?Y(n2):N(n3)
        int n1=2,n2=9,n3=-11;
        int largest=n1>n2?((n1>=n3)?n1:n3):((n2>=n3)?n2:n3);
        System.out.println("largest number:"+largest);
    }
}
