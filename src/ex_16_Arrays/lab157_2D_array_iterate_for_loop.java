package ex_16_Arrays;

public class lab157_2D_array_iterate_for_loop {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};


        for(int i=0;i<matrix.length;i++){            // Loop over rows
            for(int j=0;j<matrix[i].length;j++){      // Loop over columns
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();  // Move to next line after each row
        }
    }
}

