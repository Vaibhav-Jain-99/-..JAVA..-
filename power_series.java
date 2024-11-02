import java.util.Scanner;

public class power_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        System.out.print("Enter other Number : ");
        int s = sc.nextInt();
        int m=1;
        for (int i = 1; i <=s; i++) {
        for(int j=0;j<1;j++){
            m=n*m;
            System.out.println(m);
        }
        }
    }
}
