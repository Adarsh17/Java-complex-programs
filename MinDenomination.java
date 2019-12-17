import java.util.*;
class MinDenomination
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            count=0;
            while(arr[i]>0)
            {
                if((arr[i]-25)>=0)
                {
                    arr[i]-=25;
                    count++;
                }
                else if((arr[i]-10)>=0)
                {
                    arr[i]-=10;
                    count++;
                }
                else if((arr[i]-5)>=0)
                {
                    arr[i]-=5;
                    count++;
                }
                else
                {
                    arr[i]-=1;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
