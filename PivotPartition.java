import java.util.*;
class PivotPartition
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int arr[]=new int[n];
		int arr2[]=new int[n];
		int arr3[]=new int[n];
		int arr4[]=new int[n];
		int c=0,d=0,e=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}

		int pivot=scanner.nextInt();

		for(int i=0;i<n;i++)
		{
			if(arr[i]<pivot)
			{
				arr2[c]=arr[i];
				c++;
			}
			
			if(arr[i]==pivot)
			{
				arr3[d]=arr[i];
				d++;
			}
			
			if(arr[i]>pivot)
			{
				arr4[e]=arr[i];
				e++;
			}
		}

		Arrays.sort(arr2);
		Arrays.sort(arr4);

		for(int i=n-1;i>=n-c;i--)
		{
			System.out.print(arr2[i]);
		}
		
		for(int i=0;i<d;i++)
		{
			System.out.print(arr3[i]);
		}

		for(int i=n-1;i>=n-e;i--)
		{
			System.out.print(arr4[i]);
		}
	}
}			