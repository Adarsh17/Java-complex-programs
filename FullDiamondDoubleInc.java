import java.util.*;
class FullDiamondDoubleInc
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int rows=scanner.nextInt();
		char ch=scanner.next().charAt(0);
		int inc=1;
		for(int i=1;i<=rows;i++)
		{
			for(int j=rows-i;j>=1;j--)
			{
				System.out.print(" ");
			}

			for(int j=1;j<=inc;j++)
			{
				System.out.print(ch+"");
			}
			inc+=2;
			System.out.println();
		}
		int inc2=inc-4;
		for(int i=rows-1;i>=1;i--)
		{
			for(int j=1;j<=rows-i;j++)
			{
				System.out.print(" ");
			}

			for(int j=1;j<=inc2;j++)
			{
				System.out.print(ch+"");
			}
			inc2-=2;
			System.out.println();
		}


		
	}
}