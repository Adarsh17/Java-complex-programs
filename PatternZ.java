import java.util.*;
class PatternZ
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int rows=scanner.nextInt();
	
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows;j++)
			{
				if(i==1 || i==rows)
				{
					System.out.print(j+" ");
				}	
				else
				{
					for(int k=1;k<=(rows-i)*2;k++)
					{
						System.out.print(" ");
					}
					System.out.print(rows-i+1);
					break;
				}
			}
			System.out.println();
		}
	}
}