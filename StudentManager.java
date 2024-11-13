import java.util.Scanner;

public class StudentManager { // Array untuk menyimpan markah pelajar
    public double[] marks = new double[3]; // Array to hold marks

    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("Enter marks for student %d: ", i + 1);
            marks[i] = scanner.nextDouble();
        }
    }

    public void displayAverages() {
        double highestAverage = Double.MIN_VALUE;
        System.out.println("Student Averages:"); 
        for (int i = 0; i < marks.length; i++) { // loop untuk membaca markah untuk tiga pelajar
            double average = calculateAverage(marks[i]);
            System.out.printf("Student %d Average: %.2f%n", i + 1, average);
            highestAverage = Math.max(highestAverage, average);
        }
        System.out.printf("Highest Average: %.2f%n", highestAverage);
    }

    public double calculateAverage(double mark) {
        return mark; // Simplified as the mark 
    }
}
