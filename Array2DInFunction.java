import java.util.*;
public class Array2DInFunction {
    public static int matrix(int a,int b) {
        Scanner scr=new Scanner(System.in);
        int[][] mat=new int[a][b];
        int i,j;
        System.out.println("Enter Numbers:");
        for(i=0;i<a;i++)
        {
            for(j=0;j<b;j++)
            {
                mat[i][j]=scr.nextInt();
            }
        }
        System.out.println();
        System.out.println("MATRIx Is:");
        System.out.println();
        for(i=0;i<a;i++)
        {
            for(j=0;j<b;j++)
            {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        return 0;
    }    
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int m,n;
        System.out.println("Enter Rows");
        m=scr.nextInt();
        System.out.println("Enter Coloums:");
        n=scr.nextInt();
        matrix(m, n);
    }
}


