import java.util.*;
class DigitIncInStr
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isDigit(ch))
			{
				int num=Integer.parseInt(String.valueOf(ch));
				num++;
				System.out.print(num);
			}
			else
			{
				System.out.print(ch);
			}
		}
	}
}