import java.util.*;
class Pattern1
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int arr[]=new int[n];
		int x=1;
		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}

		for(int k=0;k<n;k++)
		{
			for(int i=0;i<arr[k];i++)
			{
				for(int j=0;j<=i;j++)
				{
					if(i==0 || j==0)
					{
						x=1;
					}
					
					else
					{
						x=x*(i-j+1)/j;
					}
					System.out.print(x+" ");
				}
				System.out.println();
			}
		}
	}
}

		