import java.util.*;
public class reverse_array_vikas_jain {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] st=new String[5];
        int i;
        for(i=0;i<5;i++)
        {
            st[i]=sc.next();
        }
        for(i=4;i>=0;i--)
        {
        System.out.print(st[i] + " ");
        }
    }
}


