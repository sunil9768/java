class FunctionOverloding
{
	public static void main(String ...args)
	{
		area(10);
		area(10.12);
		area(10,10.12);
		area(10.12,10.12);
		area(10,10);
	}
	static void area(int x)
	{
		double area=3.14*x*x;
		System.out.println("area is :="+area);
	}
	static void area(double x)
	{
		double area=3.14*x*x;
		System.out.println("area is :="+area);
	}
	static void area(int x,double y)
	{
		double area=0.5*x*y;
		System.out.println("area is :="+area);
	}
	static void area(double x,double y)
	{
		double area=0.5*x*y;
		System.out.println("area is :="+area);
	}
	static void area(int x,int y)
	{
		double area=0.5*x*y;
		System.out.println("area is :="+area);
	}
}