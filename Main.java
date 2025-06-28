import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner (System.in);
            String [] names = new String[3] ;
            double [] grades = new double[3];

            double average=0;

            for(int i = 0 ; i < 3 ; i++) {
                System.out.print("Enter name of student "+ (i+1) + ": " );
                names[i] = scanner.nextLine();
                System.out.print("Enter grade for "+ names[i] + " : ");
                grades[i] = scanner.nextDouble();
                scanner.nextLine();
                average = average + grades[i];
                if (grades[i] < 50) {
                     System.out.println(names[i] + " has failed the course.");
                }
            }
            double highestGrade = grades[0];
            String highestGradeName = names[0];
            for (int t = 1; t < 3; t++) {
                if(highestGrade < grades[t]){
                    highestGrade = grades[t];
                    highestGradeName = names[t];
                }
            }
            System.out.println(highestGradeName + " has the highest grade : " + highestGrade);
            System.out.println(average/3 + " is the class average grade.");

        }
        catch (Exception e) {
            e.printStackTrace(); 
        }
    
    }
}
