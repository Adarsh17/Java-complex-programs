import java.util.*;
class BinarySwap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int swapped=((n & 0x55)<<1 | (n & 0xAA)>>1);
		System.out.println(swapped);
	}
}
		