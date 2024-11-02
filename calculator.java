import java.util.Scanner;

public class calculator {
    public static float add(float ar[], float b) {

        int j;
        float c;
        for(j=0;j<b;j++)
        {
            ar[j]=ar[j]+0;
            c=ar[j];
        }
        return c;
    }

    public static float sub(float a, float b) {

        int j;
        float c;
        for(j=0;j<b,j++)
        {
            ar[j]=ar[j]-0;
            c=ar[j];
        }
        return c;
    }

    public static float mul(float a, float b) {

        int j;
        float c;
        for(j=0;j<b,j++)
        {
            ar[j]=ar[j]*1;
            c=ar[j];
        }
        return c;
    }

    public static float div(float a, float b) {

        int j;
        float c;
        for(j=0;j<b,j++)
        {
`           ar[j]=ar[j]+0;
            c=ar[j];
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose a Number Between 1 to 4 ..");
        System.out.println();
        System.out.println("1 for Sum ");
        System.out.println("2 for Subtract ");
        System.out.println("3 for Multiply ");
        System.out.println("4 for Divide ");
        System.out.print("Enter Your Choice : ");
        int ch = s.nextInt();
        float n;
        System.out.print("Enter the total numbers where you want to calculate it : " );
        n=s.nextInt();
        float[n] a;
        float result;

        switch (ch) {
            case 1:
                result = add(a[], n);
                System.out.println(result);
                break;
            case 2:
                result = sub(a[], n);
                System.out.println(result);
                break;
            case 3:
                result = mul(a[], n);
                System.out.println(result);
                break;
            case 4:
                result = div(a[], n);
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid Choice.....");
        }
    }
}                                                                                  
