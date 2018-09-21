/* program of variable arity method */
class VariableArityMethod
{
	public static void main(String args[])
	{
		sum();
		sum(10);
		sum(10,20);
		sum(10,20,30);
		sum(10,20,30,40);
		sum(10,20,30,40,50);
	}
	static void sum(int ...x)
	{
		int s=0;
		for(int n:x)
		s=s+n;
		System.out.println("sum is :="+s);
	}
}
	