import java.util.Scanner;
public class StudentGrade
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt(); // number of subjects
        int[] marks = new int[numSubjects];  // number of marks
        int totalMarks = 0; //initializing total marks to zero
        for (int i = 0; i < numSubjects; i++)
        {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt(); // get input of the marks
            totalMarks += marks[i]; //adding the marks
        }
        double averagePercentage = (double) totalMarks / numSubjects; //calculate the average percentage
        String grade;
        if (averagePercentage >= 90)
        {
            grade = "A";
        }
        else if (averagePercentage >= 80)
        {
            grade = "B";
        }
        else if (averagePercentage >= 70)
        {
            grade = "C";
        } else if (averagePercentage >= 60)
        {
            grade = "D";
        }
        else
        {
            grade = "F";
        } //garding calculation
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        scanner.close(); //closing the scanner
    } //main method ends
}// class ends
