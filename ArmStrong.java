import java.util.*;
public class ArmStrong {
    public static void main(String args[]) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter Three Digit Number=");
        int n=scr.nextInt();
        int c,arm=0,r;
        c=n;
        while(n>0)
        {
            r=n%10;
            arm=arm +(r*r*r);
            n=n/10;
        }
        if (c==arm) {
            System.out.println("Yes This Number (" + c + ") is ArmStrong Number");
        }
        else
        {
            System.out.println("No This Number (" + c + ") is not ArmStrong Number");
        }
    }
}

