import java.util.*;
class LongestPalindromeSub
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		String s=scanner.next();
		char ch[]=s.toCharArray();
		String ans="";
		int max=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					String sub=s.substring(i,j+1);
					StringBuffer sb=new StringBuffer(sub);
					String n=sb.reverse().toString();
					if(n.equals(sub))
					{
						if(sub.length()>max)
						{
							max=sub.length();
							ans=sub;
						}
					}
				}
			}
		}
		System.out.println("Longest Palindrome : "+ans);
		System.out.println("Longest Palindrome length : "+max);
	}
}