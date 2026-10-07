/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentrankingsystem;

/**
 *
 * @author User
 */
public class TestClass {
    public static void main(String[] args) {

        Student[] students = {
            new Student("S001", "John Cruz", "BSIT", 95.50),
            new Student("S002", "Maria Santos", "BSCS", 98.00),
            new Student("S003", "Mark Reyes", "BSIT", 91.75),
            new Student("S004", "Anna Garcia", "BSIS", 96.25),
            new Student("S005", "Paul Dela Cruz", "BSCS", 89.50),
            new Student("S006", "Kate Ramos", "BSIT", 97.00),
            new Student("S007", "James Torres", "BSIS", 93.25),
            new Student("S008", "Lisa Mendoza", "BSCS", 94.75)
        };

        System.out.println("===== STUDENTS BEFORE SORTING =====");
        displayStudents(students);

        MergeSort.sort(students);

        System.out.println("\n===== STUDENTS AFTER SORTING =====");
        displayStudents(students);

        System.out.println("\n===== TOP 3 STUDENTS =====");

        for (int i = 0; i < 3; i++) {
            System.out.printf("%d. %s - %.2f%n",
                    i + 1,
                    students[i].name,
                    students[i].finalGrade);
        }
    }

    public static void displayStudents(Student[] students) {
        System.out.printf("%-10s %-20s %-15s %s%n",
                "ID", "Name", "Program", "Final Grade");

        System.out.println("------------------------------------------------------------");

        for (Student student : students) {
            student.display();
        }
    }
}
