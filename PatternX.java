import java.util.*;
class PatternX
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int rows=scanner.nextInt();
		int inc=2*(rows-1)+1;
		for(int i=1;i<=2*(rows-1)+1;i++)
		{
			for(int j=1;j<=2*(rows-1)+1;j++)
			{
				if(j==i || j==inc)
				{
					System.out.print("x");
				}
				else
				{
					System.out.print(" ");
				}
			}
			inc--;
			System.out.println();
		}
	}
}
		