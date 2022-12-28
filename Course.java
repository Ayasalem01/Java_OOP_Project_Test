/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tbssys;

/**
 *
 * @author lenovo
 */
public class Course {
  // Fields for course name and grade
  private String name;
  private String grade;

  // Constructor to initialize course name
  public Course(String name) {
    this.name = name;
  }

  // Getter and setter methods for name and grade
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getGrade() {
    return grade;
  }
  public void setGrade(String grade) {
    this.grade = grade;
  }
}
