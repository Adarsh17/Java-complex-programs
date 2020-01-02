import java.util.*;
class MissingNumberReplace
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int arr[]=new int[n];
		int c=0;

		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}

		Arrays.sort(arr);

		for(int i=0;i<=arr[n-1];i++)
		{
			
			if(i==arr[c])
			{
				System.out.print(i+" ");
				c++;
			}

			else
			{
				System.out.print("-1"+" ");
				
			}
			
		}
	}
}