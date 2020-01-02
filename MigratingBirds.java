import java.util.*;
class MigratingBirds
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int arr[]=new int[n];
		int freq[]=new int[n];
		int count=0,visited=-1,dummy=0,result=0;

		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			count=1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					freq[j]=visited;
				}
			}

			if(freq[i]!=visited)
			{
				freq[i]=count;
			}
		}

		for(int i=0;i<n;i++)
		{
			if(freq[i]>dummy)
			{
				dummy=freq[i];
				result=arr[i];
			}
		}
		System.out.println(result);
	}
}	