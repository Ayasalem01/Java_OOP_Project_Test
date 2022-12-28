package com.mycompany.tbssys;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class Teacher extends person {
    private String subject;

  public Teacher(String personId, String firstName, String lastName, String phoneNumber, int age,String Email, String Password, String subject) {
    super(personId, firstName, lastName,phoneNumber,age, Email,  Password);
    this.subject = subject;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  //override of the speak method to specify that the person is a teacher
  @Override
  public void speak() {
    System.out.println("Hello, my name is " + getFirstName() + " " + getLastName() + " and I am a teacher teaching " + subject + ".");
  }
}
