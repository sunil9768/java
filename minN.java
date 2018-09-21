import java.util.Scanner;
class minN
{
	public static void main(String ...args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("entter the size of array:=");
		n=sc.nextInt();
		int a[]=new int[n];
		int i;
		int temp=32767;
		System.out.println("enter number in the array one by one:=");
		for(i=0;i<n;i++)
	    {
		   a[i]=sc.nextInt();	
			if(a[i]<temp)
			{
				temp=a[i];
			}
		}
		System.out.println("miin is "+temp);
	}
	
}
