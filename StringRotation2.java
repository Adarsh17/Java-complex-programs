import java.util.*;
public class StringRotation2
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.next();
        String s2=scanner.next();
        
        String s3=s1+s1;
        
        if(s3.contains(s2))
        {
            System.out.println("Correct rotation");
        }
        else{
            System.out.println("Wrong rotation");
        }
    }
}
