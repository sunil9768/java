/*  recursive function */
class Factorial
{
	public static void main(String args[])
	{
		int x= factorial(6);
		System.out.println("factorial is :="+x);
	}
	static int factorial(int n)
	{   
		int factorial=1;
		if(n==0)
		{
			return 1;
		}
		else
		{
			factorial=n*factorial(n-1);
		}
		return factorial;
	}
}