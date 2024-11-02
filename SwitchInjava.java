import java.util.*;
public class SwitchInjava {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Choose a Number Between 1 to 7: ");
        int ch=scr.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thurushday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        
            default:
            System.out.println("Invalid Choice..");
                break;
        }

    }
    

}
