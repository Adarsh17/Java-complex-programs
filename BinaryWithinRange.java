import java.util.*;
class BinaryWithinRange
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
            
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=arr[i];j++)
            {
             
                System.out.print(Integer.toBinaryString(j)+" ");
            }
        }
    }
}
