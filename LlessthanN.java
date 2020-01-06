import java.util.*;
public class LlessthanN
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.next();
        String s2=scanner.next();
        int num=Integer.parseInt(s1);
        for(int i=num;i>=0;i--)
        {
            String s=Integer.toString(i);
            if(!s.contains(s2))
            {
                System.out.println(s);
                break;
            }
        }
    }
}
