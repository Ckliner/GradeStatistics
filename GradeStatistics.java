import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalGrades = 0;
        double maxGrade = 0;
        double minGrade = 100;

        System.out.println("Let's calculate grade statistics for 5 students.");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter grade for student " + i + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                System.out.print("Enter grade for student " + i + ": ");
                scanner.next();
            }

            double grade = scanner.nextDouble();
            

            if (grade < 0 || grade > 100) {
                System.out.println("Invalid input. Please enter a grade between 0 and 100.");
                i--;
                continue;
            }

            totalGrades += grade;

            if (grade > maxGrade) {
                maxGrade = grade;
            }

            if (grade < minGrade) {
                minGrade = grade;
            }
        }

        double averageGrade = totalGrades / 5;

        System.out.println("\nGrade Statistics:");
        System.out.println("Average grade: " + averageGrade);
        System.out.println("Maximum grade: " + maxGrade);
        System.out.println("Minimum grade: " + minGrade);

        scanner.close();
    }
}
