import java.util.*;
class MissingNumber
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        int b=0,flag=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        for(int i=arr[0];i<=arr[n-1];i++)
        {
            if(i!=arr[b])
            {
                System.out.print(i+" ");
                flag=1;
            }
            else
            {
                flag=0;
                b++;
            }
        }
        if(flag!=1)
        {
            System.out.print("-1");
        }
    }
}