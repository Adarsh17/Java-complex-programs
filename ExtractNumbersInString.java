import java.util.*;
public class ExtractNumbersInString
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        int flag=0;
        for(int i=1;i<=n;i++)
        {
            flag=0;
            String s=scanner.nextLine();
            String words[]=s.split("\\D");
            
            for(int j=0;j<words.length;j++)
            {
                if(!(words[j].contains("9")))
                {
                    System.out.print(words[j]);
                    flag=1;
                }
                else{
                    System.out.print(" ");
                }
            }
             
            System.out.println();
        }
        if(flag!=1)
        {
            System.out.print("-1");
        }
       
    }
}
