import java.util.Scanner;

class ArrayPassInFunction {
    public static int array(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements:");
        int[] array1 = new int[10];
        int i;
        for (i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Array Elements:");
        System.out.println();
        for (i = 0; i < n; i++) {
            System.out.println(array1[i]);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        array(a);
    }
}

