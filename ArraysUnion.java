import java.util.*;
class ArraysUnion
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        TreeSet<Integer> ts=new TreeSet<Integer>();
        for(int i=1;i<=n1;i++)
        {
            int number=scanner.nextInt();
            ts.add(number);
        }
        for(int i=1;i<=n2;i++)
        {
            int number2=scanner.nextInt();
            ts.add(number2);
        }
        
        Iterator itr=ts.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }
}