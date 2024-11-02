import java.util.*;
public class Array2D{
    public static void main(String args[]) {
        Scanner scr=new Scanner(System.in);
        int m,n,i,j;
        System.out.println("Enter Rows:");
        m=scr.nextInt();
        System.out.println("Enter Coloum:");
        n=scr.nextInt();
        int[][] mat=new int[m][n];
        System.out.println("Enter Elements: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                mat[i][j]=scr.nextInt();
            }
        }
        System.out.println();
        System.out.println(m + "*" + n + "  Matrix...");
        System.out.println();
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
            System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
