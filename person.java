package com.mycompany.tbssys;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class person {
  private String personId;
  private String firstName;
  private String lastName;
  
  private String Email;
  private String Password;
  
  
  private String phoneNumber;
  private int age;
  
  
  
  
  public person(String personId, String firstName, String lastName, String phoneNumber, int age,String Email, String Password) {
    this.personId = personId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.age = age;
    this.Email=Email;
    this.Password=Password;
    
  }
  
  //EMail
  public String getEmail() {
    return Email;
  }

  public void setEmail(String personId) {
    this.Email = Email;
  }
  
  
  //password
  
   public String getPassword() {
    return Password;
  }

  public void setPassword(String personId) {
    this.Password = Password;
  }
  
  
  
  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void speak() {
    System.out.println("Hello, my name is " + firstName + " " + lastName + " and I am " + age + " years old.");
  }

}
