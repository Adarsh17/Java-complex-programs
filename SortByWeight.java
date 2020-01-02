import java.util.*;
class SortByWeight
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		String words[]=s.split(",");
		int arr[]=new int[words.length];
		int sum=0,b=0,temp2=0;
		String temp="";

		for(int i=0;i<words.length;i++)
		{
			sum=0;
			int num=Integer.parseInt(words[i]);
			int sqrt=(int) Math.sqrt(num);
			int square=sqrt*sqrt;

			if(square==num)
			{
				sum+=5;
			}

			if(num%4==0 && num%6==0)
			{
				sum+=4;
			}

			if(num%2==0)
			{
				sum+=3;
			}

			arr[b]=sum;
			b++;
		}

		for(int i=0;i<words.length;i++)
		{
			temp="";
			temp2=0;
			for(int j=1;j<(words.length-i);j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=words[j-1];
					words[j-1]=words[j];
					words[j]=temp;

					temp2=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp2;
				}

				else if(arr[j-1]==arr[j])
				{
					if(Integer.parseInt(words[j-1]) > Integer.parseInt(words[j]))
					{
						temp=words[j-1];
						words[j-1]=words[j];
						words[j]=temp;

						temp2=arr[j-1];
						arr[j-1]=arr[j];
						arr[j]=temp2;
					}
				}
			}
		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(words[i]+" ");
		}
	}
}


					