import java.util.*;
class StringAlphabetOrder
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String words[]=s.split("\\s");
        Arrays.sort(words);
        for(String i:words)
        {
            System.out.print(i+" ");
        }
    }
}