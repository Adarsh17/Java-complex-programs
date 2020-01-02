import java.util.*;
class CapitalizeEveryWord
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=scanner.nextLine();
		}
	
		for(int i=0;i<n;i++)
		{
		    String result="";
		    String words[]=arr[i].split("\\s");
		    for(int j=0;j<words.length;j++)
		    {
		        String sub1=words[j].substring(0,1).toUpperCase()+words[j].substring(1).toLowerCase();
		        if(j>0)
		        result=result+" "+sub1;
		        else
		        result=result+sub1;
		    }
		    System.out.println(result);
		}
		
	}
}
