import java.util.*;
class Digit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		long n = sc.nextLong();
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count=count+1;
		}
		System.out.println("The number of digits:"+count);
	}
}