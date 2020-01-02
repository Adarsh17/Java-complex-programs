import java.util.*;
class GreatWar
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<n;i++)
		{
			int count=0;
			arr[i]=scanner.nextInt();
			String binary=Integer.toBinaryString(arr[i]);
			for(int j=0;j<binary.length();j++)
			{
				char ch=binary.charAt(j);
				if(ch=='1')
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
