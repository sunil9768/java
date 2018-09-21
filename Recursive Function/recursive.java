class recursive
{
	public static void main(String ...args)
	{
		int y=factorial(5);
		System.out.println("factorial of 5 is"+y);
	}
	static int factorial (int n)
	{
		if(n==0)
		return 1;
		else
		return n*factorial(n-1);
	}
}