import java.util.*;
class LongestGapInBinary
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		String binary=Integer.toBinaryString(n);
		char ch[]=binary.toCharArray();
		int freq[]=new int[n];
		int count=0,b=0,c=0;
		
		for(int i=0;i<ch.length-1;i++)
		{
			count=0;
			if(ch[i]=='1')
			{
				b=i+1;
				while(ch[b]=='0' && ch[b]!='1' && b!=ch.length-1)
				{
					count++;
					b++;
				}
				if(ch[b]=='1')
				{
					freq[c]=count;
					c++;
				}
			}
		}

		Arrays.sort(freq);

		if(freq[n-1]==0)
		{
			System.out.print("No binary gap");
		}

		else
		{
			System.out.print("The longest binary gap is "+freq[n-1]);
		}
	}
}
				