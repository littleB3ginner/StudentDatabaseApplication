
package studentdatabaseapplication;

import java.util.Scanner;


public class StudentDatabaseApplication {


    public static void main(String[] args) {
       
        //Ask how many new users we want to add
        System.out.println("Enter number of students to enroll:");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];
        
        //Create a n number of students
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            students[i].showInfo();
        }
    }
    
}
