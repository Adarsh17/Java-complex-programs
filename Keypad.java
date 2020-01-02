import java.util.*;
class Keypad
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.next();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<arr[i].length();j++)
			{
				char ch=arr[i].charAt(j);
				if(ch=='a' || ch=='b' || ch=='c')
				{
					System.out.print(2);
				}
				if(ch=='d' || ch=='e' || ch=='f')
				{
					System.out.print(3);
				}
				if(ch=='g' || ch=='h' || ch=='i')
				{
					System.out.print(4);
				}
				if(ch=='j' || ch=='k' || ch=='l')
				{
					System.out.print(5);
				}
				if(ch=='m' || ch=='n' || ch=='o')
				{
					System.out.print(6);
				}
				if(ch=='p' || ch=='q' || ch=='r' || ch=='s')
				{
					System.out.print(7);
				}
				if(ch=='t' || ch=='u' || ch=='v')
				{
					System.out.print(8);
				}
				if(ch=='w' || ch=='x' || ch=='y' || ch=='z')
				{
					System.out.print(9);
				}
			}
			System.out.println();
		}
	}
}