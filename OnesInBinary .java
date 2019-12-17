import java.util.*;
class OnesInBinary 
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int decimal[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            decimal[i]=scanner.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            count=0;
            for(int j=1;j<=decimal[i];j++)
            {
               String binary=Integer.toBinaryString(j);
               char ch[]=binary.toCharArray();
               for(int k=0;k<ch.length;k++)
               {
                   if(ch[k]=='1')
                   {
                       count++;
                   }
               }
            }
            System.out.println(count);
        }
    }
}
