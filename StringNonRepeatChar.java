import java.util.*;
class StringNonRepeatChar
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        char ch[]=s.toCharArray();
        LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
        for(int i=0;i<ch.length;i++)
        {
            hs.add(ch[i]);
        }
        
        Iterator itr=hs.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next());
        }
    }
}
