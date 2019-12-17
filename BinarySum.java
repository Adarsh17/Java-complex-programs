import java.util.*;
public class BinarySum
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.next();
        String s2=scanner.next();
        int num1=Integer.parseInt(s1,2);
         int num2=Integer.parseInt(s2,2);
         int sum=num1+num2;
         String s3=Integer.toBinaryString(sum);
         System.out.println(s3);
    }
}
