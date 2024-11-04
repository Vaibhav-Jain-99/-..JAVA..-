import java.util.Scanner;
public class calculator {
    public static float add(float a, float b) {
        float c;
        c=a+b;
        return c;
    }

    public static float sub(float a, float b) {
        float c;
        c=a-b;
        return c;
    }

    public static float mul(float a, float b) {
        float c;
        c=a*b;
        return c;
    }

    public static float div(float a, float b) {
        float c;
        c=a/b;
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
        System.out.print("Enter the value of x : " );
        float x=s.nextInt();
        System.out.print("Enter the value of y : " );
        float y=s.nextInt();
        float result;

        switch (ch) {
            case 1:
                result = add(x,y);
                System.out.println("The Sum of Two Numbers : " + result);
                break;
            case 2:
                result = sub(x,y);
                System.out.println("The of Subtraction Two Numbers : " + result);
                break;
            case 3:
                result = mul(x,y);
                System.out.println("The Multiplication of Two Numbers : " + result);
                break;
            case 4:
                result = div(x,y);
                System.out.println("The Division of Two Numbers : " + result);
                break;
            default:
                System.out.println("Invalid Choice.....");
        }
    }
}                                                                                
