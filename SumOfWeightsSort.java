import java.util.*;
public class SumOfWeightsSort
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String arr[]=s.split(",");
        int arr2[]=new int[arr.length];
        int num=0,sum=0,b=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=0;
            num=Integer.parseInt(arr[i]);
            int sqrt=(int) Math.sqrt(num);
            int square=sqrt*sqrt;
            if(square==num)
            {
                sum=sum+5;
            }
            if(num%4==0 && num%6==0)
            {
                sum+=4;
            }
            if(num%2==0)
            {
                sum+=3;
            }
            arr2[b]=sum;
            b++;
        }
    
        for(int i=0;i<arr.length;i++)
        {
            String temp="";
            int temp2=0;
            int num2=Integer.parseInt(arr[i]);
            for(int j=1; j < (arr.length-i); j++) {
            if(arr2[j-1] > arr2[j]) {
               temp = arr[j-1];
               arr[j-1] = arr[j];
               arr[j] = temp;
               
               temp2 = arr2[j-1];
               arr2[j-1] = arr2[j];
               arr2[j] = temp2;
            }
            else if(arr2[j-1]==arr2[j])
            {
                if(Integer.parseInt(arr[j-1]) > Integer.parseInt(arr[j])){
                    
                        temp = arr[j-1];
                       arr[j-1] = arr[j];
                       arr[j] = temp;
                       
                       temp2 = arr2[j-1];
                       arr2[j-1] = arr2[j];
                       arr2[j] = temp2;
                }
            }
         }
         
        }
    for(int i=0;i<arr2.length;i++)
    {
        System.out.print(arr[i]+" "+arr2[i]);
        System.out.println();
    }
    }
}
