import java.util.*;
class AlternateNumbers
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n1=1;
        int n2=scanner.nextInt();
        int temp=n2;
        for(int i=1;i<=n2;i++)
        {
            System.out.print(n1);
            System.out.print(temp);
            n1++;
            temp--;
        }
    }
}