import java.util.*;
class SpecialNumber
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        int num=0,sum=0,mul=1,result=0;
        
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            num=arr[i];
            if(num>9 && num<100)
            {
                while(num>0)
                {
                    int r=num%10;
                    sum+=r;
                    mul*=r;
                    num/=10;
                }
                result=sum+mul;
                if(result==arr[i])
                {
                    System.out.println("Special number");
                }
                else{
                    System.out.println("Not a special number");
                }
            }
            else{
                System.out.println("Invalid input");
            }
        }
    }
}
