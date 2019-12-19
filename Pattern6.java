import java.util.*;
public class Pattern6
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=rows-2;j++)
            {
                if((i==1 && j!=1) || (i==rows && j!=1 && j!=rows-2) || (i>1 && i<rows && j==1) || (i==rows/2 && j!=2) || (i>rows/2 && j==rows-2))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
