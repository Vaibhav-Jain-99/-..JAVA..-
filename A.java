import java.util.Scanner;

class BCA {
    void BCA_Student() {
        int Roll_no;
        Scanner s1 = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Your Roll Number : ");
        Roll_no = s1.nextInt();
        if (Roll_no == 15) {
            System.out.println("vaibahv jain");
        } else {
            System.out.println("Incorrect roll Number.., ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BCA r = new BCA();
        int c, y;
        System.out.println("1. BCA (Bachelor of Computer Application)");
        System.out.println("2. BBA (Bachelor of Bussiness Administrative)");
        System.out.println();
        System.out.println("Enter Your Choice : ");
        c = s.nextInt();
        switch (c) {
            case 1:
                System.out.println("Hello ..");
                System.out.println("...Welcome in BCA...");
                System.out.println();
                System.out.println("Enter Your Addmission Year : ");
                System.out.println();
                y = s.nextInt();
                if (y == 2022) {
                    r.BCA_Student();
                } else {
                    System.out.println("Invalid year");
                }
                break;

            default:
                break;
        }
    }
}