/* if we change in formal agrument 
then there will be no any change inn actual argument */

class method5
{
	public static void main(String ...arrgs)
	{
	int x=100;
	change(x);
	System.out.printf("x is %d",x);
	}
	static void change(int x)
	{
		System.out.println("x is "+x);
		x=200;
		System.out.println("x is "+x);
	}
}