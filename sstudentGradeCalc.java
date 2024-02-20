import java.util.Scanner;

public class sstudentGradeCalc {
    public static void main(String[] args) {
        // taking marks obtained out of 100 , through user !
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects: ");
        System.out.print("JAVA : ");
        double Java = sc.nextDouble();

        System.out.print("Computer Network: ");
        double ComputerNetwork = sc.nextDouble();

        System.out.print("Computer organisation: ");
        double ComputerOrganisation = sc.nextDouble();

        System.out.print(" Web Technology: ");
        double WebTechnology = sc.nextDouble();

        System.out.print("PHP: ");
        double PHP = sc.nextDouble();

        double Sum = Java + ComputerNetwork + ComputerOrganisation + WebTechnology + PHP;
        System.out.println("Total Marks :                  " + Sum);

        double averagePercentage = (Sum / (5 * 100)) * 100;
        System.out.println("Average Percentage :           " + averagePercentage + " %");

        if (averagePercentage >= 95 && averagePercentage < 100) {
            System.out.println("Grade :                        A++");
        } else if (averagePercentage >= 90 && averagePercentage < 95) {
            System.out.println("Grade :                        A");
        } else if (averagePercentage >= 85 && averagePercentage < 90) {
            System.out.println("Grade :                        B++");
        } else if (averagePercentage >= 80 && averagePercentage < 85) {
            System.out.println("Grade :                        B");
        } else if (averagePercentage >= 75 && averagePercentage < 80) {
            System.out.println("Grade :                        C++");
        } else if (averagePercentage >= 60 && averagePercentage < 75) {
            System.out.println("Grade :                        C");
        } else if (averagePercentage >= 55 && averagePercentage < 60) {
            System.out.println("Grade :                        D++");
        } else if (averagePercentage >= 50 && averagePercentage < 55) {
            System.out.println("Grade :                        D");
        } else if (averagePercentage >= 45 && averagePercentage < 50) {
            System.out.println("Grade :                        F++");
        } else {
            System.out.println("SORRY, YOU ARE FAILED");
        }

        sc.close();
    }

}
