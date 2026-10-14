import java.util.Scanner;
class ExceptionHendlingDemo2

{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
	
		int a,b;

		System.out.print("Enter first number: ");
      	 	 a = sc.nextInt();

        	System.out.print("Enter second number: ");
       		b = sc.nextInt();

		
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;

		System.out.println("Addition:"+sum);
		System.out.println("Subtraction:"+sub);
		System.out.println("Multiplication:"+mul);
	
		try
		{
			int div;
			div=a/b;
			System.out.println("Division:"+div);
		}
		catch(Exception e)
		{
			System.out.println("you are not able to divide any number by 0, this is an exception");
		}
		System.out.println("i want to be execute");
	}
}
