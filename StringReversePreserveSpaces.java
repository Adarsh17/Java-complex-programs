import java.util.*;
class StringReversePreserveSpaces
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		for(int i=1;i<=n;i++)
		{
			String s=scanner.nextLine();
			String words[]=s.split("\\s");
			s=s.replaceAll(" ","");
			StringBuilder sb=new StringBuilder(s);
			sb.reverse();
			int c=0;
			

			for(int j=0;j<words.length;j++)
			{
				for(int k=0;k<words[j].length();k++)
				{
					char ch=sb.charAt(c);
					System.out.print(ch);
					c++;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
