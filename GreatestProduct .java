import java.util.*;
class GreatestProduct 
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            int n1=scanner.nextInt();
            int arr[]=new int[n1];
            for(int j=0;j<n1;j++)
            {
                arr[j]=scanner.nextInt();
            }
                if(n1>1)
                {
                    Arrays.sort(arr);
                    System.out.println(arr[arr.length-1]*arr[arr.length-2]);
                }
                else{
                    System.out.println("No pairs found");
                }
            
        }
    }
}