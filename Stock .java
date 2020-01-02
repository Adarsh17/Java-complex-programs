import java.util.*;
class Stock 
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int temp=0,buy=0,sell=0;
        for(int i=1;i<=n-1;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                int difference=arr[j]-arr[i];
                if(difference>temp)
                {
                    temp=difference;
                    buy=i;
                    sell=j;
                }
            }
        }
        System.out.println(buy);
        System.out.println(sell);
    }
}