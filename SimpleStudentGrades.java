import java.util.Scanner;

public class SimpleStudentGrades {
    public static void main(String[] args) {
        try (
            Scanner scanner = new Scanner(System.in)) {
            String topStudent = "";
            int topGrade = -1;
            int total = 0;
            
            for (int i = 1; i <= 3; i++) {  // Let's use 3 students for simplicity
                System.out.print("Enter student's name: ");
                String name = scanner.nextLine();
                
                System.out.print("Enter " + name + "'s grade: ");
                int grade = scanner.nextInt();
                scanner.nextLine();  // Consume leftover newline
                
                if (grade < 50) {
                    System.out.println("Warning: " + name + " has failed.");
                }
                
                if (grade > topGrade) {
                    topGrade = grade;
                    topStudent = name;
                }
                
                total += grade;
            }
            
            double average = total / 3.0;
            
            System.out.println("Average grade: " + average);
            System.out.println("Top student: " + topStudent + " with grade " + topGrade);
        }
    }
}
