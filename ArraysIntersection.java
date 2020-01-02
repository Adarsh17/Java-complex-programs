import java.util.*;
class ArraysIntersection
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int n1=scanner.nextInt();
		int n2=scanner.nextInt();
		int arr[]=new int[n1];
		int arr2[]=new int[n2];

		for(int i=0;i<n1;i++)
		{
			arr[i]=scanner.nextInt();
		}

		for(int i=0;i<n2;i++)
		{
			arr2[i]=scanner.nextInt();
		}

		int length=n1;
		if(n1>n2)
		{
			length=n2;
		}

		for(int i=0;i<length;i++)
		{
			if(arr[i]==arr2[i])
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}