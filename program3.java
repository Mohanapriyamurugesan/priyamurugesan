import java.util.*;
class Vowel
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch = sc.next().charAt(0);
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
		{
			System.out.println("\n Vowel");
		}
		else
			System.out.println("\n Consonent");
	}
}