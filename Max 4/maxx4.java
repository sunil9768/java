import java.util.Scanner;
class maxx4
  {
    public static void main (String ...x)
	 { 
	    int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("entet the value of a,b,c,d");
		   a=sc.nextInt();
		   b=sc.nextInt();
		   c=sc.nextInt();
		   d=sc.nextInt();
		if(a>b)
		   {
		     if(a>c)
			   {
			     if(a>d)
				   {
				     System.out.println("max is a"+a);
					}
				}
			}	
        else
            {
               if(c>b)
                  {
                    if(c>b)
					  {
						 if(c>a) 
                          {
                           System.out.println("max is c"+c);
                           }
					}
			}		
        if(b>d)
		   {
			if(b>a)
			 {
				if(b>c)
                {
                 System.out.println("max is b"+b);
	             }
			 }
		   } 
        else
            {
              System.out.println("max is d"+d);
            }
        }
}}		