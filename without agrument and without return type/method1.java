//without agrument and without return type //


import java.util.Scanner;
class method1
{
      
     public static void main(String ...arrgs)
	 {
	  sum();
	  mul();
	  sum();
	 }
	  static void sum()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("ener the value of a:=");
		 int a=sc.nextInt();
		 System.out.print("ener the value of b:=");
	     int b=sc.nextInt();
		 int  c=a+b;
		 System.out.println("sum is :="+c);
	 }
     static void mul()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("ener the value of a:=");
		 int a=sc.nextInt();
		 System.out.print("ener the value of b:=");
	     int b=sc.nextInt();
		 int  c=a*b;
		 System.out.println("multiplication is :="+c);
	 }	 
}