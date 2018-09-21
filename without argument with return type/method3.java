// without argument with return type

import java.util.Scanner;
class method3
{
	public static void main(String ...arrgs)
	{
		int y=sum();
		System.out.println("sum is :="+y);
	}
	static int sum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the value of a:=");
		int a=sc.nextInt();
		System.out.print("enter the value of b:=");
		int b=sc.nextInt();
		int c=a+b;
		return c;
	}
	
}