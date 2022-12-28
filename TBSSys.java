/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tbssys;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class TBSSys {

    public static void main(String[] args) {
        // create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // create a list of students
        Student[] students = new Student[3];
        //String personId, String firstName, String lastName, String phoneNumber, int age,String Email, String Password, String major,String minor,String group
        students[0] = new Student("123456", "Alice", "Smith", "555-555-1212", 22, "alola@mail.com", "qwert", "BA", "IT",  "G1");
        students[1] = new Student("789012", "Bob", "Johnson", "555-555-2323", 21, "alola@mail.com", "qwert", "BA", "IT",  "G1");
        students[2] = new Student("345678", "Charlie", "Williams", "555-555-3434", 20, "alola@mail.com", "qwert", "BA", "IT",  "G1");

        // create a list of teachers
        Teacher[] teachers = new Teacher[3];
        
        //String personId, String firstName, String lastName, String phoneNumber, int age,String Email, String Password, String subject
        teachers[0] = new Teacher("13452635", "Aya", "Salem", "5567022",22,"alola@mail.com", "qwert", "BA");
        teachers[1] = new Teacher("98887659", "Amen", "mohsen", "55578762", 19,"alola@mail.com", "qwert", "Marketing");
        teachers[2] = new Teacher("11123234", "Rafika", "halloum", "22263691", 24,"alola@mail.com", "qwert", "IT");

        // create a list of administrators
        Administrator[] administrators = new Administrator[3];
      //  String personId, String firstName, String lastName, String phoneNumber, int age,String Email, String Password, String department
                
        administrators[0] = new Administrator("99987605", "Mehdi", "Jalel", "22222222", 40,"alola@mail.com", "qwert","IT");
        administrators[1] = new Administrator("66654578", "Amira", "Dali", "5555555", 44,"alola@mail.com", "qwert", "Finance");
        administrators[2] = new Administrator("88767898", "Muhammed", "salem", "22222222", 44,"alola@mail.com", "qwert", "BA");

        // create a list of opportunities
        Opportunity[] opportunities = new Opportunity[3];
        opportunities[0] = new Scholarship("Full Tuition Scholarship");
        opportunities[1] = new Masters("Master of Business Administration");
        opportunities[2] = new Internships("Software Development Internship");

// display the main menu
        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to the University Portal!");
            System.out.println("Please select an option:");
            System.out.println("1. Student login");
            System.out.println("2. Teacher login");
            System.out.println("3. Administrator login");
            System.out.println("4. Exit");

            int selection = scanner.nextInt();
            scanner.nextLine();

switch (selection) {
case 1:  // the user is a student
                
                    System.out.println("Please enter your email address:");
                    String email = scanner.nextLine();
                    System.out.println("Please enter your password:");
                    String password = scanner.nextLine();

                    // find the student with the matching email and password
                    Student student = null;
                    for (Student s : students) {
                        if (s.getEmail().equals(email) && s.getPassword().equals(password)) {
                            student = s;
                            break;
                        }
                    }

                    // if the student was not found, display an error message
                    if (student == null) {
                        if (student == null) {
                            System.out.println("Invalid email address or password. Please try again.");
                            break;
                        }

                    // display the student menu
                    boolean studentExit = false;
                    while (!studentExit) {
                            System.out.println("Welcome, " + student.getFirstName() + "!");
                            System.out.println("Please select an option:");
                            System.out.println("1. View opportunities");
                            System.out.println("2. Check majors and minors");
                            System.out.println("3. Check group");
                            System.out.println("4. View courses and grades (optional)");
                            System.out.println("5. Search for professors' contacts (optional)");
                            System.out.println("6. Log out");

                            int studentSelection = scanner.nextInt();
                            scanner.nextLine();

                            switch (studentSelection) {

                                case 1:
                                    // view opportunities
                                    System.out.println("Here are the opportunities offered by the university:");
                                    for (Opportunity opportunity : opportunities) {
                                        System.out.println(opportunity.getname());
                                    }
                                    break;
                                case 2:
                                    // check majors and minors
                                    System.out.println("Your major is " + student.getMajor() + ".");
                                    System.out.println("Your minor is " + student.getMinor() + ".");
                                    break;
                                case 3:
                                    // check group
                                    System.out.println("Your group is " + student.getGroup() + ".");
                                    break;
                                case 4:
                                    // view courses and grades (optional)
                                    System.out.println("Here are your courses and grades:");
                                    for (Course course : student.getCourse()) {
                                        System.out.println(course.getName() + ": " + course.getGrade());
                                    }
                                    break;
                                case 5:
                                    // search for professors' contacts (optional)
                                    System.out.println("Enter the name of the professor you are searching for:");
                                    String professorName = scanner.nextLine();
                                    Teacher professor = null;
                                    for (Teacher t : teachers) {
                                        if (t.getFirstName().equals(professorName) || t.getLastName().equals(professorName)) {
                                            professor = t;
                                            break;
                                        }
                                    }
                                    if (professor != null) {
                                        System.out.println("Professor found: " + professor.getFirstName() + " " + professor.getLastName());
                                        System.out.println("Email: " + professor.getEmail());
                                        System.out.println("Phone: " + professor.getPhoneNumber());
                                    } else {
                                        System.out.println("Professor not found.");
                                    }
                                    break;
                                case 6:
                                    // log out
                                    studentExit = true;
                                    break;
                                default:
                                    System.out.println("Invalid option. Please try again.");
                                    break;
                                          }
                        }
break;
    
case 2://case teacher

  System.out.println("Please enter your login:");
  String login = scanner.nextLine();
  System.out.println("Please enter your password:");
  String password = scanner.nextLine();

  // find the teacher with the matching login and password
  Teacher teacher = null;
  for (Teacher t : teachers) {
    if (t.getLogin().equals(login) && t.getPassword().equals(password)) {
      teacher = t;
      break;
    }
  }

  // if the teacher was not found, display an error message
  if (teacher == null) {
    System.out.println("Invalid login or password. Please try again.");
    break;
  }

  // display the teacher menu
  boolean teacherExit = false;
  while (!teacherExit) {
    System.out.println("Welcome, " + teacher.getFirstName() + "!");
    System.out.println("Please select an option:");
    System.out.println("1. Upload contacts");
    System.out.println("2. Upload courses");
    System.out.println("3. View students' personal information (optional)");
    System.out.println("4. View students' grades (optional)");
    System.out.println("5. Log out");

    int teacherSelection = scanner.nextInt();
    scanner.nextLine();

    switch (teacherSelection) {
      case 1:
        // upload contacts
        System.out.println("Enter your email:");
        String email = scanner.nextLine();
        teacher.setEmail(email);
        System.out.println("Enter your phone number:");
        String phoneNumber = scanner.nextLine();
        teacher.setPhoneNumber(phoneNumber);
        System.out.println("Contacts updated successfully.");
        break;
      case 2:
        // upload courses
        System.out.println("Enter the name of the course:");
        String courseName = scanner.nextLine();
        System.out.println("Enter the number of students in the course:");
        int numStudents = scanner.nextInt();
        scanner.nextLine();
        Course course = new Course(courseName, numStudents);
        teacher.addCourse(course);
        System.out.println("Course added successfully.");
        break;
      case 3:
        // view students' personal information (optional)
        System.out.println("Enter the name of the student you want to view:");
        String studentName = scanner.nextLine();
        Student student = null;
        for (Student s : students) {
          if (s.getFirstName().equals(studentName) || s.getLastName().equals(studentName)) {
            student = s;
            break;
          }
        }
        if (student != null) {
          System.out.println("Student found: " + student.getFirstName() + " " + student.getLastName());
          System.out.println("ID: " + student.getPersonId());
          System.out.println("Phone: " + student.getPhoneNumber());
          System.out.println("Email: " + student.getEmail());
           System.out.println("Major: " + student.getMajor());
          System.out.println("Minor: " + student.getMinor());
          System.out.println("Group: " + student.getGroup());
        } else {
          System.out.println("Student not found.");
        }
        break;
      case 4:
        // view students' grades (optional)
        System.out.println("Enter the name of the student whose grades you want to view:");
        studentName = scanner.nextLine();
        student = null;
        for (Student s : students) {
          if (s.getFirstName().equals(studentName) || s.getLastName().equals(studentName)) {
            student = s;
            break;
          }
        }
        if (student != null) {
          System.out.println("Student found: " + student.getFirstName() + " " + student.getLastName());
          System.out.println("Grades:");
          for (Course c : student.getCourses()) {
            System.out.println(c.getName() + ": " + c.getGrade());
          }
        } else {
          System.out.println("Student not found.");
        }
        break;
      case 5:
        // log out
        teacherExit = true;
        break;
      default:
        System.out.println("Invalid option. Please try again.");
        break;
    }
  }
break;
case 3:// case administrator
  System.out.println("Please enter your login:");
  login = scanner.nextLine();
  System.out.println("Please enter your password:");
  password = scanner.nextLine();

  // find the administrator with the matching login and password
  Administrator administrator = null;
  for (Administrator a : administrators) {
    if (a.getLogin().equals(login) && a.getPassword().equals(password)) {
      administrator = a;
      break;
    }
  }

  // if the administrator was not found, display an error message
  if (administrator == null) {
    System.out.println("Invalid login or password. Please try again.");
    break;
  }

  // display the administrator menu
  boolean administratorExit = false;
  while (!administratorExit) {
    System.out.println("Welcome, " + administrator.getFirstName() + "!");
    System.out.println("Please select an option:");
    System.out.println("1. Add student");
    System.out.println("2. Add club");
    System.out.println("3. Add opportunity");
    System.out.println("4. Log out");

    int administratorSelection = scanner.nextInt();
    scanner.nextLine();

    switch (administratorSelection) {
      case 1:
        // add student
        System.out.println("Enter the student's first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter the student's last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter the student's ID:");
        String personId = scanner.nextLine();
        System.out.println("Enter the student's phone number:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter the student's age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the student's major:");
        String major = scanner.nextLine();
        Student student = new Student(personId, firstName, lastName, phoneNumber, age, major);
        System.out.println("Student added successfully.");
        break;
      case 2:
        // add club
        System.out.println("Enter the club's name:");
        String clubName = scanner.nextLine();
        System.out.println("Enter the club's description:");
        String description = scanner.nextLine();
        Club club = new Club(clubName, description);
        System.out.println("Club added successfully.");
        break;
      case 3:
        // add opportunity
        System.out.println("Enter the opportunity's name:");
        String opportunityName = scanner.nextLine();
        Opportunity opportunity = null;
        if (opportunityName.toLowerCase().contains("scholarship")) {
          opportunity = new Scholarship(opportunityName);
        } else if (opportunityName.toLowerCase().contains("master")) {
          opportunity = new Master(opportunityName);
        } else if (opportunityName.toLowerCase().contains("internship")) {
          opportunity = new Internship(opportunityName);
        } else {
          System.out.println("Invalid opportunity type. Please try again.");
          break;
        }
        System.out.println("Opportunity added successfully.");
        break;
      case 4:
        // log out
        administratorExit = true;
        break;
      default:
        System.out.println("Invalid option. Please try again.");
        break;
    }
  }
break;
case 4://exit
  // exit
  exit =true;
break;
default:
  System.out.println("Invalid option. Please try again.");
  break;
}

}

System.out.println("Thank you for using the system. Goodbye!");

        }
    }
}
