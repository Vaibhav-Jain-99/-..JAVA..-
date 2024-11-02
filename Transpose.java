import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m, n;
        System.out.println("Enter Rows :");
        m = s.nextInt();
        System.out.println("Enter Coloumns :");
        n = s.nextInt();
        int[][] array = new int[m][n];
        int[][] tmatrix = new int[m][n];
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.println("Enter Array elements:");
                array[i][j] = s.nextInt();
            }
        }
        System.out.println();
        System.out.println("Simple Matrix.. ");
        System.out.println();
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                tmatrix[i][j] = array[j][i];
            }
        }
        System.out.println();
        System.out.println("Transpose Of Matrtix...");
        System.out.println();
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(tmatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
