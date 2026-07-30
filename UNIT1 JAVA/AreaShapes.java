import java.util.Scanner;

class AreaShapes
{
	public static void main(String[ ] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter one integer: ");
		int n = sc. nextInt();

		double squareArea = n * n;
		double circleArea = 3.14 * n * n;
		double rectangleArea = n* n;
		
		System.out.println("\nArea of Square = " + squareArea);
		System.out.println("Area of Circle = " + circleArea);
		System.out.println("Area of Rectangle = " + rectangleArea);

		sc.close();
	}
}