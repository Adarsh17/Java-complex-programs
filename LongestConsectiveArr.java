import java.util.*;
public class LongestConsectiveArr
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        int count=0;
	int count2=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        int b=0;
        for(int i=0;i<n;i++)
        {
           if(arr[b+1]-arr[b]==1)
           {
               count++;
	       b++;
           }
	   else
	   {
		b++;
		if(arr[b+1]-arr[b]==1)
		{
			count2++;
			b++;
		}
	   }
	  
        }
	if(count>count2)
        System.out.println("The length of longest consective sequence in the array of count is "+(count+1));  

	
	else
        System.out.println("The length of longest consective sequence in the array of count2 is "+(count2+1));  
    }
}