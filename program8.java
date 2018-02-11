import java.util.*;
class Sum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number size:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0; i<n; i++)
		{
			sum=i+sum;
		}
		System.out.println("Sum of natural numbers:"+sum);
	}
}