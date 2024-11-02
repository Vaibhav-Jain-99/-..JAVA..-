import java.util.Scanner;
public class foreach {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [] arr=new int[5];
        System.out.println("Enter array elements:");
        for(int i=0;i<5;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println();
        System.out.println("These are Array elements .. ");
        System.out.println();

        for(int b : arr)
        {
            System.out.println(b);
        }
    }
}
