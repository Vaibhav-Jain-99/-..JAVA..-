import java.util.*;
public class StringProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] st=new String[5];
        int i;
        for(i=0;i<5;i++)
        {
            st[i]=sc.next();
        }
        System.out.println();
        for(i=0;i<5;i++)
        {
        System.out.println(st[i]);
        }
    }
}
