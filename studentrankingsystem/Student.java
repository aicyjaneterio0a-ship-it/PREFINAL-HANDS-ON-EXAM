/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentrankingsystem;

/**
 *
 * @author User
 */
public class Student {
    
     String studentId;
    String name;
    String program;
    double finalGrade;

    public Student(String studentId, String name, String program, double finalGrade) {
        this.studentId = studentId;
        this.name = name;
        this.program = program;
        this.finalGrade = finalGrade;
    }

    public void display() {
        System.out.printf("%-10s %-20s %-15s %.2f%n",
                studentId, name, program, finalGrade);
    }
     
}
