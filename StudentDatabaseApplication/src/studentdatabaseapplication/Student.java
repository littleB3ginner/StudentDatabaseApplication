package studentdatabaseapplication;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = "";
    private int tuitionBalance = 0;
    private int costOfCourse = 600;
    private static int id = 1000;
    //Constructor to enter students name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter first name: ");
        this.firstName = in.nextLine();
        
        System.out.println("Enter last name: ");
        this.lastName = in.nextLine();
        
        System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter class level: ");
        this.gradeYear = in.nextInt();
        
        setStudentId();
        
        
        
    }
    //Generate an ID
    private void setStudentId(){
        //Grade level + ID
        id++;
        this.studentId = gradeYear+""+id;
    }
    //Enroll in curses
    public void enroll(){
        //get inside a loop, user hits 0
        do{
        System.out.print("Enter course to enroll (Q to quit): ");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine().toUpperCase();
        if (!"Q".equals(course)) {
            courses = courses + "\n " + course;
            tuitionBalance = tuitionBalance + costOfCourse;
        }
        else {break;}
        }while(1 != 0);
      
    }
    //view balance
    public void viewBalance(){
        System.out.println("Your balance is: "+tuitionBalance);
    }
    //pay tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment:");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of: "+payment);
        viewBalance();
    }
    //show status
    public void showInfo(){
        System.out.println("----INFO----\nName: "+firstName+" "+lastName+"\nGrade level: "+gradeYear+"\nStudent Id: "+studentId+"\nCourses enrolled: "+courses+"\nBalance: "+tuitionBalance);
    }
}
