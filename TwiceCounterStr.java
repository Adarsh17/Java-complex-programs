import java.util.*;
class TwiceCounterStr
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		for(int x=1;x<=n;x++)
		{
			int n2=scanner.nextInt();
			scanner.nextLine();
		
			String s=scanner.nextLine();
			String arr[]=s.split("\\s");
	
			int freq[]=new int[100];
			int count=0,count2=0,visited=-1;
		
			for(int i=0;i<n2-1;i++)
			{
				count=1;
				for(int j=i+1;j<n2;j++)
				{
					if(arr[i].equals(arr[j]))
					{
						count++;
						freq[j]=visited;
					}
				}

				if(freq[i]!=visited)
				{
					freq[i]=count;
				}

			
				if(freq[i]==2)
				{
					count2++;
				}
			
			}

			System.out.println(count2);
		}

		


		
		
	}
}