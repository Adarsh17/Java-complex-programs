import java.util.*;
class CapitalizeVowels {

     public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        String arr[]=new String[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextLine();
        }
        
        for(int i=0;i<n;i++)
        {
            String words[]=arr[i].split("\\s");
            for(int j=0;j<words.length;j++)
            {
                for(int k=0;k<words[j].length();k++)
                {
                    char ch=words[j].charAt(k);
                    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                    {
                        System.out.print(Character.toUpperCase(ch));
                    }
                    else
                    {
                        System.out.print(Character.toLowerCase(ch));
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }
     }
}