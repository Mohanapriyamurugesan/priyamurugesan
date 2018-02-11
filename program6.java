import java.util.*;
class Leap
{	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		long n = sc.nextLong();
		if(n%4==0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Non leap year");
		}
	}
}
