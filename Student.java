package com.mycompany.tbssys;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class Student extends person{
    
    
    //attribiutes
    private String major;
    private String minor;
   
    private String group;
     // ArrayList to store student's courses
    private ArrayList<Course> courses;

    //constructor
  public Student(String personId, String firstName, String lastName, String phoneNumber, int age,String Email, String Password, String major,String minor,String group) {
    super(personId, firstName, lastName,phoneNumber,age, Email,  Password);
    this.major = major;
    this.minor = minor;
    this.courses = new ArrayList<Course>();
    
    this.group=group;
  }

  
  
  //getters and setters for major
  
  
  
  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }
  
  
  //getters and setters for minor
   public String getMinor() {
    return major;
  }

  public void setMinor(String major) {
    this.major = major;
  }
  
  //getters and setters for course
  
   // Method to add a course to the student's list of courses
  public void addCourse(Course course) {
    courses.add(course);
  }
  
    public ArrayList<Course> getCourse() {
    return courses;
  }
  
  
  //getters and setters for group
  
    public String getGroup() {
    return group;
  }

  public void setGroup(String major) {
    this.group = group;
  }
  
  

  @Override
  public void speak() {
    System.out.println("Hi, my name is " + getFirstName() + " " + getLastName() + " and I am a student studying " + major + ".");
  }
}
