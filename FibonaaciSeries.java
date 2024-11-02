import java.util.*;

public class FibonaaciSeries {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("!!...FIBONAACI SERIES...!!");
        System.out.println();
        System.out.print("Enter Which Number Where You Want The End Of Series: ");
        int n = scr.nextInt();
        System.out.println();
        System.out.println();
        int i, num1 = 0, num2 = 1, num3;
        System.out.println(num1);
        System.out.println(num2);
        for (i = 2; i < n; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.println(num3);
        }
    }
}
