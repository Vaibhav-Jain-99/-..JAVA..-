import java.util.Scanner;
public class fibonaaci_sereis {
    public static int fibonaaci(int  n) {
        if(n==0||n==1)
        return n;
        else 
        return fibonaaci(n-2)  + fibonaaci(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total Number of series where u want : ");
        int a=sc.nextInt();
        int i;
        for(i=0;i<a;i++)
        {
           System.out.println(fibonaaci(i)); 
        }
    }
}
