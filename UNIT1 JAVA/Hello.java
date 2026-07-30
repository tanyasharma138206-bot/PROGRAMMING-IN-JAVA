import java.lang.*;
import java.util.Scanner;

class Hello
{
	public static void main(String args[ ])
	{
		int no1;

		System.out.println("Enter no:");
		Scanner sc = new Scanner(System.in);

		no1 = sc.nextInt();
		System.out.println("Entered no is:" + no1);
	}
}