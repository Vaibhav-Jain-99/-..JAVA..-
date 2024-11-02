import java.util.Scanner;
public class table {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number which You want to table : ");
        int n=s.nextInt();
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.println(n + " * " + i + " = " + n*i );
        }
    }
}