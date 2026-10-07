/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentrankingsystem;

/**
 *
 * @author User
 */
public class MergeSort {
    
  public static void sort(Student[] students) {
        if (students.length < 2) {
            return;
        }

        int mid = students.length / 2;

        Student[] left = new Student[mid];
        Student[] right = new Student[students.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = students[i];
        }

        for (int i = mid; i < students.length; i++) {
            right[i - mid] = students[i];
        }

        sort(left);
        sort(right);

        merge(students, left, right);
    }

    private static void merge(Student[] students,
                               Student[] left,
                               Student[] right) {

        int i = 0;
        int j = 0;
        int k = 0;

        // Highest grade to lowest grade
        while (i < left.length && j < right.length) {
            if (left[i].finalGrade >= right[j].finalGrade) {
                students[k] = left[i];
                i++;
            } else {
                students[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            students[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            students[k] = right[j];
            j++;
            k++;
        }
    }
}
