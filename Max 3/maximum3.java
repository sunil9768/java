import java.util.Scanner;
class maximum3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=0;
		int c=0;
		System.out.print("enetr the value of a:");
		a=sc.nextInt();
		System.out.print("enetr the value of b:");
		b=sc.nextInt();
		System.out.print("enetr the value of c:");
		c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.print("max is a");
		}
			else 
				if(b>a && b>c)
			{
				System.out.print("max is b");
			}
		else
		{
			System.out.print("max is c");
		}
	}
}
		

		