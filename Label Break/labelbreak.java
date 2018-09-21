import java.util.Scanner;
class labelbreak
{
	public static void main(String args[])
	{
	label1:
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==3)
					break label1;
				System.out.println(j);
			}
		}
	}
}
