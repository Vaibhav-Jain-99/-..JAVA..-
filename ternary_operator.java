import java.util.Scanner;
class ternary_operator{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the Values of A B and C");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        int r=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("Greatest Element : " + r);
    }
}