import java.util.*;
class Main
{
	public static void main(String args[]0
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		if(n<0)
		{
			System.out.println("Negative");
		}
		else if(n>0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Zero");
		}
	}
}