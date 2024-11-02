import java.util.Scanner;
public class swapping {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Swapping of two Numbers ");
        System.out.print("Enter The Value of a : ");
        int a=s.nextInt();
        System.out.print("Enter The Value of b : ");
        int b=s.nextInt();
        System.out.println("The Value of A and B before Swapping ");
        System.out.println();
        System.out.print("The Value of a : ");
        System.out.println(a);
        System.out.print("The Value of b : ");
        System.out.println(b);
        System.out.println();
        System.out.println();
        System.out.println();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The Value of A and B After Swapping ");
        System.out.println();
        System.out.print("The Value of a : ");
        System.out.println(a);
        System.out.print("The Value of b : ");
        System.out.println(b);
    }
}
