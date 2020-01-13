import java.util.*;
public class LargestPossible
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String arr[]=new String[n];
        int q[]=new int[10];
        int quo=0,num=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.next();
            if(arr[i].length()==1 || arr[i].length()==2)
            {
                num=Integer.parseInt(arr[i]);
                quo=num/10;
                q[b]=quo;
            }
             if(arr[i].length()==3)
            {
                num=Integer.parseInt(arr[i]);
                quo=num/100;
                q[b]=quo;
            }
        }
    }
}
