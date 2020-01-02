import java.util.*;
class PatternSpecificRow
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int x=0;
        for(int j=0;j<=rows;j++)
        {
            if(j==0)
            {
                x=1;
            }
            else
            {
                x=x*(rows-j+1)/j;
            }
            System.out.print(x+" ");
        }
        System.out.println();
    }
}