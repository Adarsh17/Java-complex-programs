import java.util.*;
class HexaToBin
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		int num=Integer.parseInt(s,16);
		System.out.println(Integer.toBinaryString(num));
	}
}