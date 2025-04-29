package ex_16_Arrays;

public class lab160_pyramid_pattern {
    public static void main(String[] args) {

        int n=5;  //n refers to no of rows
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){   //print spaces before stars
                System.out.print(" ");
            }
            //print stars
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
