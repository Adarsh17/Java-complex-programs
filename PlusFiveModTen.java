import java.util.*;
public class PlusFiveModTen
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        char ch[]=s.toCharArray();
        int arr[]=new int[ch.length];
        int b=0,c=0;
        for(int i=0;i<ch.length;i++)
        {
            int num=Integer.parseInt(String.valueOf(ch[i]));
            arr[b]=(num+5)%10;
            b++;
        }
        
        for(int i=0;i<ch.length-2;i++)
        {
            int temp=arr[c];
            arr[c]=arr[c+2];
            arr[c+2]=temp;
            
            int temp2=arr[c+1];
            arr[c+1]=arr[c+3];
            arr[c+3]=temp2;
        }
        
        System.out.print(arr[c+2]);
        System.out.print(arr[c+3]);
        System.out.print(arr[c]);
        System.out.print(arr[c+1]);
    }
}
