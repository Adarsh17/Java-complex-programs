import java.util.*;
class GreatestPrime
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		if(num>1)
		{
		for(int i=1;i<=num;i++)
		{
			int n=scanner.nextInt();
			int temp=0;
			for(int j=1;j<n;j++)
			{
				int flag=0;
				for(int k=2;k<=j/2;k++)
				{
					if(j%k==0)
					{
						flag=1;
					}
				}
				if(flag!=1)
				{
					if(j>temp)
					temp=j;
				}
			}
			System.out.println(temp);
		}
		}

		else
		{
			System.out.println("Invalid input");
		}
	}
}

			