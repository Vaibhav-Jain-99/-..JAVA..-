public class PatternLoop{
    public static void main(String[] args) {
        int i,j,k;
        for(i=0;i<5;i++)
        {
            for(j=0;j<4-i;j++)
            {
                System.out.print(" ");
            }
            for(k=0;k<1+2*i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=3;i>=0;i--)
        {
            for(k=0;k<4-i;k++)
            {
                System.out.print(" ");
            }
            for(j=0;j<1+2*i;j++)
            {
                System.err.print("*");
            }
            System.err.println();
        }
    }
}