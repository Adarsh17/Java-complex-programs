import java.util.*;
public class UpDownLeftRight
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        char ch[]=s.toCharArray();
        int c1=0,c2=0,c3=0,c4=0;
        
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='U')
            {
                c1++;
            }
            if(ch[i]=='D')
            {
                c2++;
            }
            if(ch[i]=='L')
            {
                c3++;
            }
            if(ch[i]=='R')
            {
                c4++;
            }
        }
        
        if(c1==c2 && c3==c4)
        {
            System.out.println("True");
        }
        
        else
        {
            System.out.println("False");
        }
    }
}
