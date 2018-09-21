// with argument and without return type //


import java.util.Scanner;
class method2
{
	public static void main(String ...arrgs)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the value of a:=");
        int a=sc.nextInt();
		System.out.print("enteer the value of b:=");
		int b=sc.nextInt();
		sum(a,b); // acctual argument
		div(a,b);
	}
	static void sum(int x,int y) // formal argument
	{
	
		int c=x+y;
		System.out.println("sum of "+x+" and "+y+" is:="+c);
	}
	static void div(int x,int y)
	{
		int c=x/y;
		System.out.println("division of "+x+" and "+y+" is:="+c);
	}
}
	