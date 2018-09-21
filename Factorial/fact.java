import java.util.Scanner;
class fact
{
	public static void main(String ...args)
	{
		int n=1;
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:=");
		n=sc.nextInt();
			for(int i=1;n>0;i++)
			{
				fact=fact*n;
				n--;
			}
		System.out.print("factorial is:="+fact);
	}
}
	
	