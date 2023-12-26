import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int row;
        int col;

        // Row and col entered
        System.out.println("Please enter row number: ");
        row = scan.nextInt();

        System.out.println("Please enter col number: ");
        col = scan.nextInt();

        // assigning value to matrix
        int[][] matrix = new int[row][col];

        // printing matrix
        int newValue = 1;  // Declare and initialize newValue
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                matrix[r][c] = newValue;
                newValue++;
                System.out.print(matrix[r][c] + "  ");
            }
            System.out.println();
        }
        // create transpose matrix
        int[][] transposeMatrix = new int[col][row];

        // fill transpose matrix
        for (int r = 0; r < col; r++) {
            for (int c = 0; c < row; c++) {
                transposeMatrix[r][c] = matrix[c][r];
            }
        }

        // printing transpose matrix
        System.out.println("\nTranspose Matrix:");
        for (int r = 0; r < col; r++) {
            for (int c = 0; c < row; c++) {
                System.out.print(transposeMatrix[r][c] + "  ");
            }
            System.out.println();
        }
    }
}


