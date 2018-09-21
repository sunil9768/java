import java.util.Scanner;
class maxN
{
	public static void main(String ...args)
	{
		maxN();
	}
	public static void maxN()
	{
		Scanner sc=new Scanner(System.in);
		int temp=0;
		int n;
		System.out.println("enter the size of array:=");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter number in the array one by one:=");
		for(int i=0;i<n;i++)
	    {
		   a[i]=sc.nextInt();	
			if(a[i]>temp)
			{
				temp=a[i];
			}
		}
		System.out.println("max is "+temp);
	}
}