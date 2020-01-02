import java.util.*;
class StringIndex
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		for(int i=1;i<=n;i++)
		{
			String s1=scanner.nextLine();
			String s2=scanner.nextLine();
			System.out.println("Index of first occurance of Y in X is "+s1.indexOf(s2));
		}	
	}
}

