package skill3;
import java.util.Scanner;
public class sum_of_two_matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];

        System.out.println("Enter elements of first matrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Sum of the two matrices:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
        }

	}

}
