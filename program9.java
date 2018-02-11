import java.util.*;
class Num
{
	public static void main(String args[])
	{
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N:");
		int N = sc.nextInt();
		System.out.println("Enter the value of K:");
		int K = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<n; i++)
		{
			sum=a[i]+sum;
		}
		System.out.println("Sum of K value is"+"\n"+sum);
	}
}