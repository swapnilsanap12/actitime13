import java.util.Scanner;
class CheckChar
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);

		System.out.println("Enter a Character:");
		char ch = s.next().charAt(0);

		if (ch >= '0' && ch <='9')
		{
			System.out.println("It is a Digit:");
		}
		else if ((ch >= 'a' && ch <= 'z') || ( ch >= 'A' &&  ch <= 'z' ))
		{
			if (ch >= 'a' && ch <= 'z' )
			{
				System.out.println("It is a Lowercase:");
			}
			else
			{
				System.out.println("It is a Uppercase:");
			}
		}
		else
		{
				System.out.println("It is a Special Character:");
		}
		
	}
}
