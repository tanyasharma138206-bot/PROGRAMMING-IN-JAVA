import java.util.Scanner;

public class AgeReader {
	public static void main(String args[ ]) {

	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your age: ");
	int age = input.nextInt();
	System.out.println("Wow, your are" + age + "years old!");
	input.close();
	}
}
	