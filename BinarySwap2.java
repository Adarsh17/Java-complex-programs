import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int decimal=scanner.nextInt();
        String s=Integer.toBinaryString(decimal);
       char ch[]=s.toCharArray();
       
        String s1="";
       
       for(int i=0;i<ch.length;i+=2)
       {
           char temp=ch[i];
           ch[i]=ch[i+1];
           ch[i+1]=temp;
           
            s1=s1+ch[i]+ch[i+1];
       }
       
       
       int n=Integer.parseInt(s1,2);
       System.out.print(n);
       
    }
}
