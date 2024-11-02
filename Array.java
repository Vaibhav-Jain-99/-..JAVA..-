import java.util.Scanner;
public class Array {
    public static void main(String args[]) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter Array Elements:");
        int[] array=new int[10];
        int i;
        for(i=0;i<5;i++)
        {
            array[i]=scr.nextInt();
        }
        System.out.println();
        System.out.println("Array Elements:");
        System.out.println();
        for(i=4;i>=0;i--)
        {
            System.out.println(array[i]);
        }   
}

}
