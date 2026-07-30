import java.util.Scanner;

public class StudentGradeSystem
{
    public static void main(String[] args)
{
        Scanner sc = new Scanner(System.in);

    

        System.out.print("Enter student's marks (0-100): ");
        int marks = sc.nextInt();

      

        if (marks >= 90 && marks <= 100)
{
            System.out.println("Grade: A+");
            System.out.println("Result: Excellent");
        }
        else if (marks >= 80)
{
            System.out.println("Grade: A");
            System.out.println("Result: Very Good");
        }
        else if (marks >= 70)
{
            System.out.println("Grade: B");
            System.out.println("Result: Good");
        }
        else if (marks >= 60)
{
            System.out.println("Grade: C");
            System.out.println("Result: Average");
        }
        else if (marks >= 50)
{
            System.out.println("Grade: D");
            System.out.println("Result: Pass");
        }
        else if (marks >= 0)
{
            System.out.println("Grade: F");
            System.out.println("Result: Fail");
        }
        else
{
            System.out.println("Invalid Marks!");
        }

        sc.close();
    }
}
