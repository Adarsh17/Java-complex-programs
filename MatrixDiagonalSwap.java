import java.util.*;
public class MatrixDiagonalSwap
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int arr[][]=new int[n1][n2];
        
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                arr[i][j]=scanner.nextInt();
            }
        }
        int x=0,y=n1-1;
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(i==j)
                {
                    int temp=arr[i][j];
                    arr[i][j]=arr[x][y];
                    arr[x][y]=temp;
                    x++;
                    y--;
                }
                
            }
        }
        
         for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
