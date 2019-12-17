import java.util.*;
class StringDivisibility 
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.next();
        String s2=scanner.next();
        int l1=s1.length();
        int l2=s2.length();
        if(l2%l1==0)
        {
            System.out.println("Divisor");
        }
        else{
            System.out.println("Not a divisor");
        }
    }
}
