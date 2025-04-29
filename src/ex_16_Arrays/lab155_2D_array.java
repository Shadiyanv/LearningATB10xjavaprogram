package ex_16_Arrays;

public class lab155_2D_array {
    public static void main(String[] args) {
        int[][] array_2D=new int[3][3];
        array_2D[0][0]=90;
        array_2D[0][1]=90;
        array_2D[0][2]=90;
        array_2D[1][0]=90;
        array_2D[1][1]=90;
        array_2D[1][2]=90;
        array_2D[2][0]=90;
        array_2D[2][1]=90;
        array_2D[2][2]=90;


        // Printing the 2D array
        for (int i = 0; i < array_2D.length; i++) {            // Loop over rows
            for (int j = 0; j < array_2D[i].length; j++) {      // Loop over columns
                System.out.print(array_2D[i][j] + " ");
            }
            System.out.println();  // Move to next line after each row
        }
        //array_2D[i][j] → print the element at row i and column j.
        //+ " " → after printing the number, add a space so numbers don't stick together.


    }
}
