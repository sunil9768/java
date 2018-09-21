// with argument and wirh return type

import java.util.Scanner;
class method4
{
	public static void main(String ...rrgs)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.print("enter the value of  a:=");
	  int a=sc.nextInt();
	  System.out.print("enter the value of  b:=");
	  int b=sc.nextInt();
	  int y=sum(a,b); // actual arguments
	  System.out.print("sum is:="+y);
	}
	static int sum(int x,int y) //formal arguments
	{
		int c=x+y;
		return c;
	}
}