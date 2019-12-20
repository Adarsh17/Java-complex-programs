import java.util.*;
class StringRotation
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
                String s=scanner.next();
                int n2=scanner.nextInt();
            
                if(i%2!=0)
                {
                    String sub1=s.substring(0,n2);
                    s=s.replace(sub1,"");
                    s=s+sub1;
                }
                else
                {
                    String sub2=s.substring(0,n2);
                    s=s.replace(sub2,"");
                    s=s+sub2;
                }
                System.out.println(s);
        }
    }
}
