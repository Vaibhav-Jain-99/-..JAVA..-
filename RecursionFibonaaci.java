import java.util.*;
public class RecursionFibonaaci {
    public static int fibonaaci(int n) {
        if(n==0 || n==1)
        {
            return n;
        }
        else
        return fibonaaci(n-2) + fibonaaci(n-1);
    }
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int i,m;
        System.out.println("Enter the Ending Number of Series:");
        m=scr.nextInt();
        System.out.println("Fibonaaci Series..");
        for(i=0;i<m;i++)
        {
            System.out.println(fibonaaci(i));
        }
    }
}
